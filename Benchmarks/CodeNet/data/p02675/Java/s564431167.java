import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int d = Integer.parseInt(f.readLine())%10;
        if(d == 2 || d == 4 || d == 5 || d == 7 || d == 9){
            out.println("hon");
        }else if(d == 3){
            out.println("bon");
        }else{
            out.println("pon");
        }


        out.close();
    }
}
