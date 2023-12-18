import java.util.Scanner;

/*
問題文

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String c = b.substring(0, b.length()-1);
        if (a.equals(c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}