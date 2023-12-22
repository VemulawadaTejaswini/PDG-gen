import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int N = Integer.parseInt(br.readLine());
            String strSplit[] = br.readLine().split(" ");
            int Li[] = new int[N];
            int maxNumber = 0;
            int maxNumberIndex = 0;
            for(int i=0; i<N; i++){
                int L = Integer.parseInt(strSplit[i]);
                if(maxNumber < L){
                    maxNumber = L;
                    maxNumberIndex = i;
                }
                Li[i] = L;
            }
            
            int sum = 0;
            for(int i=0; i<N; i++){
                if(i != maxNumberIndex){
                    sum = sum + Li[i];
                }
            }

            if(sum > maxNumber){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}