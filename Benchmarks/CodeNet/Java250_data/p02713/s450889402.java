import java.util.*;

public class Main{
    static int gcd(int a,int b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int sum=0;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=k;j++){
                for(int m=1;m<=k;m++){
                    sum+=gcd(gcd(i,j),m);
                }
            }
        }
        System.out.println(sum);
    }
}


       
   