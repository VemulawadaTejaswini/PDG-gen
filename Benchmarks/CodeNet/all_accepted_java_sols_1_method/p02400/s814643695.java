import java.util.Scanner;
class Main{
     public static void main(String[] av){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double s=r*r*Math.PI;
        double l=r*2*Math.PI;
        System.out.println(String.format("%.6f",s)+" "+String.format("%.6f",l));
    }
}
