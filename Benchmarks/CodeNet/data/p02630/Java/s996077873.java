/* package codechef; // don't place package name! */
// old but im not that old
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            } catch (Exception e){
                e.printStackTrace();
            }
            return str;
        }
    }
    static int modPower(int x, int y, int mod){
        int res = 1;
        x %= mod;
        if(x==0) return 0;
        while(y>0){
            if(y%2==1){
                res = (res*x)%mod;
            }
            y = y>>1;
            x = (x*x)%mod;
        }
        return res;
    }
    static class Student{
        String name;
        int age;
        Student(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        FastReader in = new FastReader();
        int n = in.nextInt();
        Map<Integer, Integer> m = new HashMap<>();
        long s = 0;
        for(int i = 0; i < n; i++){
            int a = in.nextInt();
            if(!m.containsKey(a)){
                m.put(a, 0);
            }
            m.replace(a, m.get(a) + 1);
            s += a;
        }
        int q = in.nextInt();
        while(q-->0){
            int b = in.nextInt(), c = in.nextInt();
            if(m.containsKey(b)){
                s -= m.get(b) * b;
                s += m.get(b) * c;
                if(!m.containsKey(c)){
                    m.put(c, 0);
                }
                m.replace(c, m.get(c) + m.get(b));
                m.replace(b, 0);
            }
            System.out.println(s);
        }
    }
}
