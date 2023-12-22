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
        int count = 0;
        
        for(int i = 0; i < 200; i++){
            aHP -= tATK;
            count++;
            if(aHP <= 0){
                break;
            }
            tHP -= aATK;
            count++;
            if(tHP <= 0){
                break;
            }
        }
        
        out.println(count % 2 != 0 ? "Yes" : "No");
        out.close();
        
    }
}