import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double cir = 2 * Math.PI *a;
        double area = Math.PI * a *a;
        System.out.printf("%.5f ",area);
        System.out.printf("%.5f %n", cir);
    }
}

