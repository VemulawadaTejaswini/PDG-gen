import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        double n=(double)sc.nextLong();
        long sum=0;
        long t=1;
        while(n!=1){
            n=Math.floor(n/2);
            sum+=t;
            t*=2;
        }
        System.out.println(sum+t);
    }
}
