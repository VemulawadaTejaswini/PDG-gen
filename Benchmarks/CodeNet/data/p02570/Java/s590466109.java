import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kala=new Scanner (System.in);
        double D=kala.nextInt();
        
        double T=kala.nextInt();
        
        double S=kala.nextInt();
        
        double reach=D/S;
        
        if(reach<=T) System.out.println("Yes");
        else System.out.println("No");
    }
}