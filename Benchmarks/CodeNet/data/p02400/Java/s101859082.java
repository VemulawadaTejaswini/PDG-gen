import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        double P = r*r*3.1415926536;
        double E = 2*3.1415926536*r;
        System.out.printf("%f %f",P,E);
    }
}