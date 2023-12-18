// 提出時に消す


import java.util.Scanner;

// 提出時にMainに変更する
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1000 - n % 1000;
        if (ans == 1000) {
            ans = 0;
        }

        System.out.println(ans);

        sc.close();
    }
}