import java.util.*;
import java.io.*;
 
class Prg {
    public static void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String t;
        String ans = "";
        for(int i = 1;; i++){
            t = reader.readLine();
            if(t.equals("0")) break;
            System.out.println("Case " + i + ": " + Integer.parseInt(t));
        }
    }
}