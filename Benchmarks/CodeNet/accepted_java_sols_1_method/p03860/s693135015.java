import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 入力(sPre)
        String sPre = sc.next();
        // 入力(s)
        String s = sc.next();
        // 入力(sPost)
        String sPost = sc.next();

        System.out.println(String.format("A%sC", s.charAt(0)));
        sc.close();
    }
}