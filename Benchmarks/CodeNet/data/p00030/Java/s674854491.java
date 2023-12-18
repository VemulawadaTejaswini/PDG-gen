import javafx.util.Pair;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int n = sc.nextInt();
            int s = sc.nextInt();
            if(n==0&&s==0)break;
            System.out.println(answer(n,s,-1));
        }
    }
    static int answer(int n,int s,int p)
    {
        if (n==0)return (s==0)?1:0;
        int ans =0;
        for(p++;p<=Math.min(s,9);p++)
        {
            ans +=answer(n-1,s-p,p);
        }
        return ans;
    }
}