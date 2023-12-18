import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        int a, b, c, d;
        c = 0;
        d = 0;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = a * b;
        d = 2 * a + 2 * b;
        System.out.println(c +" "+ d);
    }
}
