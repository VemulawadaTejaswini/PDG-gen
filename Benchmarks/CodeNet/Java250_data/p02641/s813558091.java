import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        FastReader in = new FastReader();
        test a=new test();
        a.solve(in,out);
        out.close();
    }
}

class test {
    public void solve(FastReader in, PrintWriter out) {
        int x =in.nextInt();
        int n=in.nextInt();
        ArrayList<Integer> my =new ArrayList<>();
        for(int i=0;i<n;i++){
            my.add(in.nextInt());
        }
        Collections.sort(my);
        if(n==0){
            out.println(x);
        }
        
        else if(!my.contains(x)){
            out.println(x);
        }
        else{
            int k=x;int i=1;
            while(true){
                if(!my.contains(k-i)){
                    k=k-i;
                    break;
                }
                else if(!my.contains(k+i)){
                    k=k+i;
                    break;
                }
                i++;
            }
            out.println(k);
        }
    }
}

class FastReader{
    BufferedReader br;
    StringTokenizer st;

    public FastReader(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next(){
        while(st==null || !st.hasMoreElements()){
            try{
                st=new StringTokenizer(br.readLine());
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt(){
        return Integer.parseInt(next());
    }

    Long nextLong(){
        return Long.parseLong(next());
    }

    double nextDouble(){
        return Double.parseDouble(next());
    }
    String nextLine(){
        String str="";
        try{
            str=br.readLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return str;
    }
}