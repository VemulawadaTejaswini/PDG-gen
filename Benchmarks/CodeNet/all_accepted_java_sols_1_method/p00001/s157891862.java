import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int[] num=new int[10];
        
        for(int i=0;i<10;i++){
            num[i]=Integer.valueOf(buf.readLine());
        }
        Arrays.sort(num);
        
        for(int i=0;i<3;i++){
            System.out.println(num[9-i]);
        }
    }
}