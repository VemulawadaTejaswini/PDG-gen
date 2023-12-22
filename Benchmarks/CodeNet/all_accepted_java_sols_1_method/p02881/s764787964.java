import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long min = (long)999999999999.0;
        for(long i=1;i<=Math.sqrt(N);i++)  if(N%i==0&&min > (i-1)+(N/i)-1) min = (i-1)+(N/i)-1;
        System.out.println(min);
    }
}