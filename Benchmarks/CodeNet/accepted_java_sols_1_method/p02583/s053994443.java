import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            
            int N = Integer.parseInt(br.readLine());
            String strSplit[] = br.readLine().split(" ");
            int Li[] = new int[N];
            
            for(int i=0; i<N; i++){
                Li[i] = Integer.parseInt(strSplit[i]);
            }
            
            int count = 0;
            for(int i=0; i<N-2; i++){
                for(int j=i+1; j<N-1; j++){
                    for(int k=j+1; k<N; k++){
                        if(Li[i]!=Li[j] && Li[j]!=Li[k] && Li[i]!=Li[k] && Li[i]+Li[j] > Li[k] && Li[i]+Li[k] > Li[j] && Li[j]+Li[k] > Li[i]){
                            count++;
                        }
                    }
                }
            }
            
            System.out.println(count);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}