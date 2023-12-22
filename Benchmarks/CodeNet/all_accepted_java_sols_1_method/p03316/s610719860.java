import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        String[] nd = String.valueOf(n).split("");
        int sn = 0;
        for (int i = 0; i < nd.length; i++) {
            sn += Integer.parseInt(nd[i]);
        }
        if (n % sn == 0) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
