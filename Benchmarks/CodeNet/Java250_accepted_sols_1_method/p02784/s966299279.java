import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        int A[] = new int[N];
        int sum = 0;
        for(int i=0;i<N;i++)
        {
            sum = sum + sc.nextInt();
        }
        if(sum >= H)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
