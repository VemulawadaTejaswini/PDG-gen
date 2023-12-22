import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[10];
        for(int i=0;i<N;i++)
        {
            int a=0;
            int b = 0;
            boolean flag = true;
            for(int j=0;j<10;j++)
            {
                int t = sc.nextInt();
                if(t>a&& t> b)
                {
                    if(a>b)
                        a = t;
                    else
                        b = t;
                }   
                else if(t>a)
                    a = t;
                else if(t>b)
                    b = t;
                else
                    flag = false;
            }
            if(flag)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}

