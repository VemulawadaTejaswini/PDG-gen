import java.io.*;
  
public class Main {
    public static void main(String[] args) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));       
        try {
            String line;
            while((line=r.readLine())!=null){
                /* input from here */
                int m,n;
                m = Integer.parseInt(line.split(" ")[0]);
                n = Integer.parseInt(line.split(" ")[1]);
                if(m<n){
                    int t = m;
                    m = n;
                    n = t;
                }
                /* input till here */
                /* processing from here */
                while(n!=0){
                    int t = n;
                    n = m%n;
                    m = t;
                }
                /* processing till here */
                /* output */
                System.out.println(m);              
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}