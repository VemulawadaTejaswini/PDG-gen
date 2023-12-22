import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = "";

        if (a < b) {
            op = "<";
        } else if (a > b) {
            op = ">";
        } else {
            op = "==";
        }


        System.out.println("a " + op + " b");
        sc.close();
    }
}
