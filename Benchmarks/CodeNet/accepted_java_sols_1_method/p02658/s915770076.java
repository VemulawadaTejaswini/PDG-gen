import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] a=new long[n];
        long mul=1;
        boolean con=true;
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        long num=1000000000000000000l;
        for(int i=0;i<n;i++){
            long ini=mul;
            mul*=a[i];
            if(mul<ini || mul>num){
                con=false;
            }
            if(a[i]==0){
                mul=0;
                con=true;
            }
        }
        if(con) System.out.println(mul);
        else System.out.println("-1");
    }
}