import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long sum = 0;
        long min = 1000000000000l;
        double num2 = Math.sqrt(num);
        long num3 = (long)num2+1;
        for(long i=1;i<=num3;i++)
        {
            if(num%i==0)
            {
                sum = num/i-1 + i-1;
            }
            if(sum<min)
            {
                min = sum ;
            }
        }
        System.out.println(min);
    }
}
