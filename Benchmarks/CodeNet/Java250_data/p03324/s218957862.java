import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        a = scan.nextInt(); b = scan.nextInt();
        if(b == 100) {
            b += 1;
        }
        System.out.println((int)Math.pow(100,a)*b);
    }
}
