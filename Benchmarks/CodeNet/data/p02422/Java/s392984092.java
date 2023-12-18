import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        char[] str = in.next().toCharArray();
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            String order = in.next();
            int beginIndex = in.nextInt(), endIndex = in.nextInt();

            if(order.equals("print")){
                print(str, beginIndex, endIndex);
            }
            else if(order.equals("reverse")){
                reverse(str, beginIndex, endIndex);
            }
            else if(order.equals("replace")){
                char[] rep = in.next().toCharArray();
                replace(str, rep, beginIndex, endIndex);
            }
        }
    }

    static void print(char[] str, int beginIndex, int endIndex){
        PrintWriter out = new PrintWriter(System.out);

        for(int i = beginIndex; i <= endIndex; i++){
            out.print(str[i]);
        }
        out.println();
        out.flush();

        return;
    }

    static void replace(char[] str, char[] rep, int beginIndex, int endIndex){
        for(int i = 0; i < rep.length; i++){
            str[beginIndex + i] = rep[i];
        }

        return;
    }

    static void reverse(char[] str, int beginIndex, int endIndex){
        char[] str_rev = new char[endIndex - beginIndex + 1];

        for(int i = 0; i < str_rev.length ; i++){
            str_rev[i] = str[endIndex - i];
        }

        replace(str, str_rev, beginIndex, endIndex);

        return;
    }

    
}
