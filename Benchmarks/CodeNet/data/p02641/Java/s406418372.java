
import java.io.*;
import java.util.Scanner;


class main{

    static boolean check(int q, int N, int arr[]) {
        for (int a = 0; a<N; a++) {
            if (arr[a] == q)
            {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int N = scan.nextInt();
        int a[] = new int[N];
        for (int j = 0; j < N; j++) {
            a[j] = scan.nextInt();
        }
        scan.close();

        Boolean res = new Boolean(false);

        if (check(X, N, a)==true)
        {
            res=true;
        }
        if (!res)
        {
            System.out.print(""+X);
        }

        else
        {
            int p=X-1 , q=X+1;
            while(res)
            {
                if(!check(p,N,a))
                {
                    res=true;
                    System.out.print(""+p);
                    break;   
                }
                if(!check(q,N,a))
                {
                    res=true;
                    System.out.print(""+q);
                    break;   
                }
                
                p--;
                q++;
                
            }
        }
        
    }
}
