import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double Pai= Math.PI;
        double r = sc.nextDouble();
        double P = r*r*Pai;
        double E = 2*Pai*r;
        System.out.printf("%6f %6f",P,E);
    }
}