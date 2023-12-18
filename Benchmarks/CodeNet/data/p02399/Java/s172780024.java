import java.util.Scanner;

class Main{

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int f1,f2;
        double f3;
        f1 = a / b;
        f2 = a % b;
        f3 = (double)a / (double)b;
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(String.format("%.5f",f3));

        
    }
}
