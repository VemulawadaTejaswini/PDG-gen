import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n= sc.nextInt();
            if(n==0) break;
            int i;
            int[] ten;
            ten=new int[n];
            int sum=0;
            for(i=0;i<n;i++){
                ten[i]=sc.nextInt();
                sum=sum+ten[i];
            }
            double ave=(double)sum/n;
            double t;
            double s;
            t=0;
            for(i=0;i<n;i++){
                t=t+(ten[i]-ave)*(ten[i]-ave);
            }
            s=t/n;
            System.out.printf("%f\n",Math.sqrt(s));
        }
    }
}
