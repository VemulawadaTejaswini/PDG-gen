// 提出時に消す


import java.util.Scanner;

// 提出時にMainに変更する
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        if (Character.isUpperCase(sc.next().charAt(0))) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }

        sc.close();
    }
}