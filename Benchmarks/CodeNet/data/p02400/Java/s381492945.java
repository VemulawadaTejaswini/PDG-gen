import java.util.Scanner;
import java.lang.Math;

public class Main {
   
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r;
        double men,shu;
        r=scan.nextInt();
        
        men=r*r*Math.PI;
        shu=r*2*Math.PI;
        System.out.println(men+" "+shu);
    }
}