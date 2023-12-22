import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String strSplit[] = br.readLine().split(" ");
            int N = Integer.parseInt(strSplit[0]);
            int D = Integer.parseInt(strSplit[1]);
            
            int ans = 0;
            for(int i=0; i<N; i++){
                String pqSplit[] = br.readLine().split(" ");
                long p = Integer.parseInt(pqSplit[0]);
                long q = Integer.parseInt(pqSplit[1]);
                
                double pq = Math.sqrt(p*p + q*q);
                
                if(pq <= D){
                    ans++;
                }
            }
            
            System.out.println(ans);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}