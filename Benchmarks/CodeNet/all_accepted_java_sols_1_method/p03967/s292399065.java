import java.util.*;
import java.io.*;
public class Main {
    public static void main(String [] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;
        for(int i = 0;i < str.length();i++){
            if((i & 1) == 0){
                if(str.charAt(i) == 'p')--cnt;
            }
            if((i & 1) == 1){
                if(str.charAt(i) == 'g')++cnt;
            }
        }
System.out.print(cnt);
    }
}