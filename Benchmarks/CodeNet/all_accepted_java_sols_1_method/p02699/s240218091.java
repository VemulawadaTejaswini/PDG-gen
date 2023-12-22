import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{  
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        long S=Long.parseLong(str[0]);
        long W=Long.parseLong(str[1]);
        if(W>=S) System.out.println("unsafe");
        else System.out.println("safe");
        }
    }
