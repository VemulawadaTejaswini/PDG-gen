import java.util.Scanner;

class Main {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int area = a*b;
        int circumference = 2*(a+b);
        System.out.print(area);
        System.out.println(" " + circumference);
        
    }
}
