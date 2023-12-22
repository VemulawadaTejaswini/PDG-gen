// 提出時に消す


import java.util.Scanner;

// 提出時にMainに変更する
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        StringBuilder ans = new StringBuilder();

        while (n != 0) {
            n--;
            ans.append((char) ('a' + n % 26));
            n /= 26;
        }

        ans = ans.reverse();

        System.out.println(ans);

        sc.close();
    }
}