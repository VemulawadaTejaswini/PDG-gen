import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double S =r*r*Math.PI, L =2*r*Math.PI;
            System.out.println(String.format("%.6f",S)+" "+String.format("%.6f",L));
        sc.close();
    }
}
