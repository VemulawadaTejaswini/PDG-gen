import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int ma=0,mi=10000,sum=0,n,si,i;
        Scanner s = new Scanner(System.in);
        while(true){
           n = s.nextInt();
           if(n==0)break;
           for(i=0;i<n;i++){
            si = s.nextInt();
            sum += si;
            if(ma<si)ma = si;
            if(mi>si)mi = si;
           }
           System.out.println((sum-ma-mi)/(n-2));
           sum=0;
           ma=0;
           mi=10000;
        }
    }
}
