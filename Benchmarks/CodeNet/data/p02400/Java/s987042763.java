import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r;
        double men,shu,pi=3.14159265;
        r=scan.nextInt();
        
        men=(double)r*(double)r*pi;
        shu=(double)r*2*pi;
        System.out.println(men+" "+shu);
    }
}