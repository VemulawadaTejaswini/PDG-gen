import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String strSplit[] = br.readLine().split(" ");
            int N = Integer.parseInt(strSplit[0]);
            int X = Integer.parseInt(strSplit[1]);
            int T = Integer.parseInt(strSplit[2]);
            
            int count = 0;
            while(true){
                N = N - X;
                count++;
                if(N <= 0){
                    break;
                }
            }
            
            System.out.println(T*count);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}