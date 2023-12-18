import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double r=scanner.nextDouble();
        double s=r*r*3.14;
        double l=2*r*3.14;
        System.out.printf("%f %f",s,r);
        
    }

}