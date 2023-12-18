import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String strSplit[] = br.readLine().split(" ");
            int A = Integer.parseInt(strSplit[0]);
            int B = Integer.parseInt(strSplit[1]);
            int C = Integer.parseInt(strSplit[2]);
            int D = Integer.parseInt(strSplit[3]);
            
            int AC = Math.max(A, C);
            int BD = Math.min(B, D);
            
            if(BD > AC){
                System.out.println(BD-AC);
            }else{
                System.out.println("0");
            }
            
        }catch(Exception e){
            
        }
    }
}