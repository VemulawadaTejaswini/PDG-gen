import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{  
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        long A=Long.parseLong(str[0]);
        long B=Long.parseLong(str[1]);
        long C=Long.parseLong(str[2]);
        long D=Long.parseLong(str[3]);
        long E=(A%D==0)?A/D:A/D+1;
        long F=(C%B==0)?C/B:C/B+1;
        if(F<=E) System.out.println("Yes");
        else System.out.println("No");
        }
    }
