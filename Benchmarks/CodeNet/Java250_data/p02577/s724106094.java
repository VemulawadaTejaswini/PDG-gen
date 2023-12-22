// package Contest#176;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String str = br.readLine();
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            sum += str.charAt(i)-'0';
        }

        if(sum % 9 == 0){
            out.println("Yes");
        }else{
            out.println("No");
        }
        out.close();
    }
}