import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner scan= new Scanner(System.in);
       double r=scan.nextDouble();
       double pi=Math.PI;
        System.out.printf("%f %f",r*r*pi,2*r*pi);
    }
}

