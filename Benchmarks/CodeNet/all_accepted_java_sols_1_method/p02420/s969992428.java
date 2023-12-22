import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while((str = br.readLine()) != null){
            if(str.equals("-")){
                break;
            }

           StringBuilder aabc =new StringBuilder(str);
           int L = aabc.length();//4
           str = br.readLine();
           int m = Integer.parseInt(str);//3
           for(int i=0;i<m;i++){
            str = br.readLine();
            int h = Integer.parseInt(str);//1,2,1
            String temp = aabc.substring(0,h);//substring doesn't include index No of h
            aabc.append(temp);
            aabc.delete(0,h);
           }

           System.out.println(aabc.toString());
        }
    }
}