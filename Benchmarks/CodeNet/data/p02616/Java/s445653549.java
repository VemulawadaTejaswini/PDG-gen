import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]);
        s=bu.readLine().split(" ");
        int i,a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(s[i]);
        Arrays.sort(a);
        long ans=1,M=1000000007;
        ans=maxProduct(a,n,k);
        ans=(ans+M)%M;
        System.out.print(ans);
    }

    static long maxProduct(int A[], int n, int k)
    {
        long product=1,M=1000000007;

        if(A[n-1]==0 && k%2!=0)  return 0;
        if(A[n-1]<=0 && k%2!=0)
        {
            for(int i=n-1; i>=n-k;i--) product=(product*A[i])%M;
            return product;
        }

        int i=0,j=n-1;
        if(k%2!=0)
        {
            product=product*A[j]%M;
            j--;
            k--;
        }
        k>>=1;

        for(int itr=0;itr<k; itr++)
        {
            long left_product=1l*A[i]*A[i+1];
            long right_product=1l*A[j]*A[j-1];

            if(left_product>right_product)
            {
                product=product*(left_product%M)%M;
                product%=M;
                i+=2;
            }
            else
            {
                product=product*(right_product%M)%M;
                product%=M;
                j-=2;
            }
        }
        return product;
    }
}