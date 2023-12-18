import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            //String N = br.readLine();
            int N = Integer.parseInt(br.readLine());
            String strSplit[] = br.readLine().split(" ");
            int A[] = new int[N];
            for(int i=0; i<N; i++){
                A[i] = Integer.parseInt(strSplit[i]);
            }
            
            long ans = 0;
            for(int i=0; i<N-1; i++){
                int a = A[i];
                int b = A[i+1];
                
                if(a > b){
                    ans = ans + a - b;
                    A[i+1] = a;
                }
            }
            
            System.out.println(ans);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}