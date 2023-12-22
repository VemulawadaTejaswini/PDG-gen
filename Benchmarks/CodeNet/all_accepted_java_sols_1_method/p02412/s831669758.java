import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n == 0 && x == 0) break;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    int y = x - (i + 1 + j + 1);
                    if(y < j+1 && y >0)
                    {
                        ans ++;
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
