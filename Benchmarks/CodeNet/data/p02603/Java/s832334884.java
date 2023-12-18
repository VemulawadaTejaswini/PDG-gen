import java.util.*;
import java.io.*;
public class Main {
    static class Scan {
        private byte[] buf=new byte[1024];
        private int index;
        private InputStream in;
        private int total;
        public Scan()
        {
            in=System.in;
        }
        public int scan()throws IOException
        {
            if(total<0)
            throw new InputMismatchException();
            if(index>=total)
            {
                index=0;
                total=in.read(buf);
                if(total<=0)
                return -1;
            }
            return buf[index++];
        }
        public int scanInt()throws IOException
        {
            int integer=0;
            int n=scan();
            while(isWhiteSpace(n))
            n=scan();
            int neg=1;
            if(n=='-')
            {
                neg=-1;
                n=scan();
            }
            while(!isWhiteSpace(n))
            {
                if(n>='0'&&n<='9')
                {
                    integer*=10;
                    integer+=n-'0';
                    n=scan();
                }
                else throw new InputMismatchException();
            }
            return neg*integer;
        }
        public double scanDouble()throws IOException
        {
            double doub=0;
            int n=scan();
            while(isWhiteSpace(n))
            n=scan();
            int neg=1;
            if(n=='-')
            {
                neg=-1;
                n=scan();
            }
            while(!isWhiteSpace(n)&&n!='.')
            {
                if(n>='0'&&n<='9')
                {
                    doub*=10;
                    doub+=n-'0';
                    n=scan();
                }
                else throw new InputMismatchException();
            }
            if(n=='.')
            {
                n=scan();
                double temp=1;
                while(!isWhiteSpace(n))
                {
                    if(n>='0'&&n<='9')
                    {
                        temp/=10;
                        doub+=(n-'0')*temp;
                        n=scan();
                    }
                    else throw new InputMismatchException();
                }
            }
            return doub*neg;
        }
        public String scanString()throws IOException
        {
            StringBuilder sb=new StringBuilder();
            int n=scan();
            while(isWhiteSpace(n))
            n=scan();
            while(!isWhiteSpace(n))
            {
                sb.append((char)n);
                n=scan();
            }
            return sb.toString();
        }
        private boolean isWhiteSpace(int n)
        {
            if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
            return true;
            return false;
        }
    }
    static int n,arr[],dp[][][][];
    public static void main(String args[]) throws IOException {
        Scan input=new Scan();
        n=input.scanInt();
        arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.scanInt();
        }
        int money=1000,stock=0;
        for(int i=0;i<n-1;i++) {
            if(arr[i+1]>arr[i]) {
                int j=i;
                while(j<n-1 && arr[j+1]>arr[j]) {
                    j++;
                }
                int tmp1=money;
                int tmp2=stock;
                tmp2+=tmp1/arr[i];
                tmp1%=arr[i];
                tmp1+=tmp2*arr[j];
                if(tmp1>money) {
                    money=tmp1;
                }
                i=j-1;
            }
        }
        System.out.println(money);
    }
    public static int solve(int indx,int stock,int money,int state) {
        if(indx==n) {
            return money;
        }
        if(dp[indx][stock][money][state]!=-1) {
            return dp[indx][stock][money][state];
        }
        int ans=0;
        if(state==0) {
            if(money>=arr[indx]) {
                ans=Math.max(ans,solve(indx,stock+1,money-arr[indx],0));
            }
            ans=Math.max(ans,solve(indx,stock,money,1));
        }
        if(state==1) {
            if(stock>0) {
                ans=Math.max(ans,solve(indx,stock-1,money+arr[indx],1));
            }
            ans=Math.max(ans,solve(indx+1,stock,money,0));
        }
        dp[indx][stock][money][state]=ans;
        return ans;
    }
}
