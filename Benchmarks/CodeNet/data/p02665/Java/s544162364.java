import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws Exception {
        StringBuilder sb = new StringBuilder();
        FastReader in = new FastReader(System.in);
        int i, j;
        boolean ok=false;
        int t=ok?in.nextInt():1;
        while(t-->0){
            int n=in.nextInt();
            int arr[]=new int[n+1];
            for(i=0;i<=n;i++)
                arr[i]=in.nextInt();
            if(n==0){
                sb.append("1\n");
                continue;
            }
            if(arr[0]==1){
                int f=0;
                for(i=1;i<=n;i++){
                    if(arr[i]!=0){
                        f=1;
                        break;
                    }
                }
                if(f==0)
                    sb.append("1\n");
                else
                    sb.append("-1\n");
                continue;
            }
            long ans=1;
            long max[]=new long[n+1];
            max[0]=1;
            for(i=1;i<=n;i++){
                long z=max[i-1]*2;
                z=z-arr[i];
                max[i]=(long)Math.min(z,1e9);
            }
            long cur=arr[n];
            int f=0;
            for(i=n;i>=1;i--){
                ans+=cur;
                if(max[i-1]*2<cur){
                    f=1;
                    break;
                }
                else if(max[i-1]<cur){
                    cur=max[i-1];
                }
                cur+=arr[i-1];
            }
            if(f==0)
                sb.append(ans).append("\n");
            else {
                sb.append("-1\n");
            }
        }
        System.out.print(sb);

    }
}

class FastReader {

    byte[] buf = new byte[2048];
    int index, total;
    InputStream in;

    FastReader(InputStream is) {
        in = is;
    }

    int scan() throws IOException {
        if (index >= total) {
            index = 0;
            total = in.read(buf);
            if (total <= 0) {
                return -1;
            }
        }
        return buf[index++];
    }

    String next() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }

    int nextInt() throws IOException {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }

    long nextLong() throws IOException {
        int c;
        long val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }
}
 
 