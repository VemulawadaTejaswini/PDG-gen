
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double c = sc.nextDouble();
        double H, L, Ar,C;
        c = (c*Math.PI)/180;
        H = B* Math.sin(c);
        Ar = (A* H)/2;
        double A1 = B * Math.cos(c);
        C = Math.sqrt(Math.pow(A-A1, 2)+Math.pow(H, 2));
        L = A+B+C;
       System.out.printf("%.4f\n%.4f\n%.4f\n",Ar,L,H);
    }
}
