import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int n=scan.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        int z[]=new int[n];
        double p1=0,p2=0,p3=0,pi=0;
        for(int i=0;i<n;i++){
            x[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            y[i]=scan.nextInt();
            if(x[i]>=y[i]){
                z[i]=x[i]-y[i];
            }else{
                z[i]=y[i]-x[i];
            }
        }

        for(int i=0;i<n;i++){
            p1+=z[i];
            p2+=z[i]*z[i];
            p3+=z[i]*z[i]*z[i];
            if(z[i]>=pi){
                pi=z[i];
            }
        }
        p2=Math.sqrt(p2);
        p3=Math.pow(p3,1/3.0);

        System.out.printf("%f\n",p1);
        System.out.printf("%f\n",p2);
        System.out.printf("%f\n",p3);
        System.out.printf("%f\n",pi);
    }
}

