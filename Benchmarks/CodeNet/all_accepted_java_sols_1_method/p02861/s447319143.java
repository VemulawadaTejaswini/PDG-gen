import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        double total=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                total+=(double)Math.sqrt(Math.pow(x[i]-x[j],2)+Math.pow(y[i]-y[j],2));
            }
        }
        System.out.println((double)total*2/n);

    }
}