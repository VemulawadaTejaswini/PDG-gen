import java.util.Scanner;


// 145_a
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        String n = a < b ? "0" : "10";
        System.out.println(n);

    }

}
