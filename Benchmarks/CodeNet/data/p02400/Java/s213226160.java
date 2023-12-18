import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();  
        double pi =Math.PI;
        sc.close();        
        double CArea = r*r*pi;
        double Clength =2*r*pi;
        System.out.printf("%f %f",CArea, Clength);

    }
}
