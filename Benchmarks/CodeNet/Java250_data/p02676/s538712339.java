import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int K = Integer.valueOf(reader.readLine());
            String S = reader.readLine();
            int Slen = S.length();
            String ans;
            if(Slen>K){
                ans = S.substring(0,K)+"...";
            }else{
                ans = S;
            }
            System.out.println(ans);
        }catch(IOException e){
            System.out.println("aaaa");
        }
    }
}