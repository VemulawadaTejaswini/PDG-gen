import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int anum = Integer.parseInt(s.next());
        int bnum = Integer.parseInt(s.next());

        int coins = 0;
        for (int i = 0; i < 2; i++) {
            if (anum < bnum) {
                coins += bnum;
                bnum--;
            } else{
                coins += anum;
                anum--;
            }
        }
        System.out.println(coins);
    }
}