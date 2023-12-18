import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double x[]=new double[4];
        double y[]=new double[4];
        for(int i=0; i<n; i++){
            for(int j=0; j<4; j++){
                x[j]=sc.nextDouble();
                y[j]=sc.nextDouble();
            }
            double d1=(y[1]-y[0])/(x[1]-x[0]);
            double d2=(y[3]-y[2])/(x[3]-x[2]);
            System.out.println(d1==d2?"YES":"NO");
        }
    }
}