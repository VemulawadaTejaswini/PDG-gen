import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int N = Integer.parseInt(br.readLine());
            String strSplit[] = br.readLine().split(" ");
            long A[] = new long[N];
            
            for(int i=0; i<N; i++){
                A[i] = Integer.parseInt(strSplit[i]);
            }
            
            int ans = 0;
            boolean even = true;
            while(true){
                for(int i=0; i<N; i++){
                    if(A[i]%2 != 0){
                        even = false;
                        break;
                    }else if(i == N-1){
                        ans++;
                    }
                    
                    A[i] = A[i]/2;
                }
                
                if(!even){
                    break;
                }
            }
            
            System.out.println(ans);
        }catch(Exception e){
            
        }
    }
}