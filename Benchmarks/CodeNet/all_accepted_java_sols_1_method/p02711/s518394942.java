import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String str1 = sc.next();
        // スペース区切りの整数の入力

        String str2 = "7";

        int result = str1.indexOf(str2);
        if (result != -1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
