import java.util.*;
public class Main{
    public static void main(String[] args) {
        int n;
        int m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int [] a=new int [m];
        int sum=0;
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        if(n>=sum){
            System.out.println(n-sum);
        }
        else{
            System.out.println("-1");
        }

    }
}