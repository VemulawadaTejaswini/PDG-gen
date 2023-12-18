import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double x3=x2-x1;
        double y3=y2-y1;
        double Lx,Ly,L=0;
        Lx=x3*x3;
        Ly=y3*y3;
        L=Lx+Ly;
        double k;
        k=Math.sqrt(L);
        System.out.println(k);
    }
}
