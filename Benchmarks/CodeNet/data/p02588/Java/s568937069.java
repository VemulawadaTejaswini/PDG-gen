import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            this.br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while(this.st == null || !this.st.hasMoreElements()) {
                try {
                    this.st = new StringTokenizer(this.br.readLine());
                } catch (IOException var2) {
                    var2.printStackTrace();
                }
            }

            return this.st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(this.next());
        }

        long nextLong() {
            return Long.parseLong(this.next());
        }
        double nextDouble(){return Double.parseDouble(next());}
        String nextLine() {
            String str = "";

            try {
                str = this.br.readLine();
            } catch (IOException var3) {
                var3.printStackTrace();
            }

            return str;
        }
    }
    public static void main(String[] args) {
      FastReader in = new FastReader();
      int n=in.nextInt();
      double a[]=new double[n];
      for(int i=0;i<n;i++){
          a[i]=in.nextDouble();
      }
      int count=0;
      for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
              double c=a[i]*a[j];
              if(c==Math.floor(c)){
                  count++;
              }
          }
      }
      System.out.println(count);
    }
}
