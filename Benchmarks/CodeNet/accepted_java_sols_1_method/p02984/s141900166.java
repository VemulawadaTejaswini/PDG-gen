import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int x[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        x[0]=0;
        for(int i=0;i<n;i++){
            x[0]+=((i%2==0)?a[i]:-a[i]);
        }
        for(int i=1;i<n;i++){
            x[i]=2*a[i-1]-x[i-1];
        }
        
        for(int i=0;i<n;i++){
        System.out.print(x[i]+((i==n-1)?"":" "));}
    }
}
