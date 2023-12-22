import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Hlength=sc.nextInt();
        int Mlength=sc.nextInt();
        int H=sc.nextInt();
        int M=sc.nextInt();
        double Hdiff=(double)M/60;
        double Hdeg=90-(360*(H+Hdiff)/12);
        double Mdeg=90-(360*M/60);
 
        double Hth=Math.toRadians(Hdeg);
        double Mth=Math.toRadians(Mdeg);
 
        double Hx=Hlength*Math.cos(Hth);
        double Hy=Hlength*Math.sin(Hth);
        double Mx=Mlength*Math.cos(Mth);
        double My=Mlength*Math.sin(Mth);
 
        double dis=Math.sqrt(Math.pow((Hx-Mx),2)+Math.pow((Hy-My),2));
        System.out.println(dis);
        sc.close();
    }
}