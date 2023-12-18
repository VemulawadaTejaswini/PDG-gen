import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%2==1)
        {
            System.out.println("No");
        }
        else
        {
            int ans = 0;
            String str = sc.next();
            String S[] = str.split("");
            for(int i=0;i<N/2;i++)
            {
                if(S[N/2+i].equals(S[i]))
                {
                    ans++;
                }
            }
            if(N/2==ans)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}