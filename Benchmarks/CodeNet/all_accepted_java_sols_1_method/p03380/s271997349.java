import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] a=new double[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        Arrays.sort(a);
        
        double m=a[n-1];
        int r=0;
        for(int i=0;i<n;i++){
            if(a[i]>=m/2){
                if(i==0){
                    r=i;
                    break;
                }else{
                    if(a[i]-m/2<m/2-a[i-1]){
                        r=i;
                    }else{
                        r=i-1;
                    }
                    break;
                }
            }
        }
        int N=(int) m;
        int R=(int) a[r];
        System.out.println(N+" "+R);
    }
}