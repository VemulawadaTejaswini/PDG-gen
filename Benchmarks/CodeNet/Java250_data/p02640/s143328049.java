import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String strSplit[] = br.readLine().split(" ");
            int X = Integer.parseInt(strSplit[0]);
            int Y = Integer.parseInt(strSplit[1]);
            
            for(int i=0; i<=X; i++){
                for(int j=0; j<=X-i; j++){
                    if(i*2+j*4 == Y && i+j == X){
                        System.out.println("Yes");
                        return;
                    }
                }
            }
            
            System.out.println("No");
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}