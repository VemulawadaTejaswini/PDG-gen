import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sb1 = br.readLine();
        String[] a = sb1.split(" ");
        long[] c = new long[a.length];
        long[] b = new long[a.length];
        long d  = 2019;
        for(int i = 0;i < a.length;i++){
            c[i] = Long.parseLong(a[i]);
            b[i] = c[i]/d;
        }
        
        if(b[0] == b[1]){
            for (long i = c[0]; i < c[1]; i++) {
                for (long j = i+1; j <= c[1]; j++) {
                    long e = i % 2019;
                    long f = j % 2019;
                    long g = e * f;
                    d = Math.min(d, g % 2019);
                }
            }
            System.out.println(d);
        }  else {
            System.out.println(0);
        }
        
    }
}