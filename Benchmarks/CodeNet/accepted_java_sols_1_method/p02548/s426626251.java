import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        long sum = 0;
        for(int i=1;i<n;i++){
            int one = 0;
            if(n%i==0)one=1;
            int tmp=(int)n/i-one;
            sum+=tmp;
        }
        System.out.println(sum);
    }
}
