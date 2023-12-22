import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int cnt = 0;
        int i = 1;
        while(n >= i) {
            if (String.valueOf(i).length() % 2 == 1) {
                cnt++;
            }
            i++;
        }
        System.out.println(cnt);
    }
}