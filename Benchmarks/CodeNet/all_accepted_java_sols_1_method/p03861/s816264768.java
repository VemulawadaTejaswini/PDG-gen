import java.io.*;
import java.util.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        long a=Long.parseLong(st.nextToken());
        long b=Long.parseLong(st.nextToken());
        long x=Long.parseLong(st.nextToken());
        if(a%x==0){
            System.out.println((b/x-a/x)+1);
        }else{
            System.out.println(b/x-a/x);
        }
        
    }
}