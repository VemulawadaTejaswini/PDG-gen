import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double sum = 0;
        double ans = 0;
        for(int i=1;i<=N;i++)
        {
            if(i%2==1)
            {
               sum++; 
            }
        }
        ans = sum / N;
        System.out.println(ans);
    }
}
