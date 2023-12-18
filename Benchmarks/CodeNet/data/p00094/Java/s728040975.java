import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextInt();
        double b = sc.nextInt();
        double t = 3.305785;
        double S;
        
        S = a * b;
        
        System.out.println(S / t);
    }
}
