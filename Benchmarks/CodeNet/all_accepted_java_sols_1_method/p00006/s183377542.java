import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            StringBuilder sb = new StringBuilder();
            String str = br.readLine();
            String[] s= str.split("",0);
            for(int i=0;i<s.length;i++){
                sb.append(s[s.length-1-i]);
            }
            System.out.println(sb);
        }catch(Exception ex){
            System.exit(0);
        }
    }
}