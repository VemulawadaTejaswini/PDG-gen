import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //入力
        int num = sc.nextInt();
        String str = sc.next();

        if (num >= 3200) {
            System.out.println(str);
        } else {
            System.out.println("red");
        }

    }
}