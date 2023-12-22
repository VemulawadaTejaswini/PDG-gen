import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0 - N - M;
        for(int i=N;i>0;i--)
        {
            sum = sum + i;
        }
        for(int i=M;i>0;i--)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
