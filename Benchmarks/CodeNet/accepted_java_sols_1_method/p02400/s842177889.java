import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double area = Math.PI * a *a;
        double length = Math.PI *2 *a;
        System.out.printf("%.6f\n%.6f",area,length);
        sc.close();
    }
}
