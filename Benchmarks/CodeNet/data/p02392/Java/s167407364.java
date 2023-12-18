import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a<b && b<c) System.out.printf("%d<%d<%d\n", a, b, c);
        else System.out.println("No");
        scan.close();
    }
}
