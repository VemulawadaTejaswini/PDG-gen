import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = (int)Math.ceil((a+b)/2.0d);
        
        System.out.println(x);
        scan.close();
        
    }
}