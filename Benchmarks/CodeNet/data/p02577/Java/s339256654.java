import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = str.length();
        String[] array = str.split("");
        int ans = 0;

        for (int i = 0; i < l; i++) {
            int tmp = Integer.parseInt(array[i]);
            ans += tmp;
        }
        if (ans % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}