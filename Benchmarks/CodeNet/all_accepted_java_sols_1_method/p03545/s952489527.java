import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split("");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        String[] op = new String[3];
        
        if(a + b + c + d == 7){
            op[0] = "+";
            op[1] = "+";
            op[2] = "+";
        }
        
        if(a + b + c - d == 7){
            op[0] = "+";
            op[1] = "+";
            op[2] = "-";
        }
        
        if(a + b - c + d == 7){
            op[0] = "+";
            op[1] = "-";
            op[2] = "+";
        }
        
        if(a + b - c - d == 7){
            op[0] = "+";
            op[1] = "-";
            op[2] = "-";
        }
        
        if(a - b + c + d == 7){
            op[0] = "-";
            op[1] = "+";
            op[2] = "+";
        }
        
        if(a - b + c - d == 7){
            op[0] = "-";
            op[1] = "+";
            op[2] = "-";
        }
        
        if(a - b - c + d == 7){
            op[0] = "-";
            op[1] = "-";
            op[2] = "+";
        }
        
        if(a - b - c - d == 7){
            op[0] = "-";
            op[1] = "-";
            op[2] = "-";
        }
        
        
        out.println(a + op[0] + b + op[1] + c + op[2] + d + "=7");
        out.close();
        
    }
}