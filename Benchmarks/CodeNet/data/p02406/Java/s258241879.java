import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        //System.out.println(x);
        int count=0;
        int a=1;
        for(; count<x; count++){
            
                if(a%3==0){
                    sb.append(" ");
                    sb.append(a);
                    //System.out.println(a);
                }else if(a%10==3){
                    sb.append(" ");
                    sb.append(a);
                    //System.out.println(a);
                }
            a++;
        }
        System.out.println(sb);
    }
}