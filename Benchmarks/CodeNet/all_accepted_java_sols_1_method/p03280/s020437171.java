import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String strSplit[] = br.readLine().split(" ");
            int A = Integer.parseInt(strSplit[0]);
            int B = Integer.parseInt(strSplit[1]);
            
            System.out.println(A*B - (A+B-1));
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}