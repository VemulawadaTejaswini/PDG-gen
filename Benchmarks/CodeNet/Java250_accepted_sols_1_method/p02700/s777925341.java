import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int tHP = Integer.parseInt(str[0]);
        int tATK = Integer.parseInt(str[1]);
        int aHP = Integer.parseInt(str[2]);
        int aATK = Integer.parseInt(str[3]);
        
        while(true){
            aHP -= tATK;
            if(aHP <= 0){
                out.println("Yes");
                break;
            }
            tHP -= aATK;
            if(tHP <= 0){
                out.println("No");
                break;
            }
        }
        
        out.close();
        
    }
}