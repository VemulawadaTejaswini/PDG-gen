// 提出時に消す


import java.util.Scanner;

// 提出時にMainに変更する
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();

        if (d <= s * t) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}