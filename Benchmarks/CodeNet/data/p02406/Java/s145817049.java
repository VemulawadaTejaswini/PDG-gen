import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        //System.out.println(x);
        int count=0;
        int a=1,b=1;
        if(x>=3 && x<10000){
            for(; count<x; count++){
                
                    if(a%3==0){
                        sb.append(" ");
                        sb.append(a);
                        //System.out.println(a);
                    }else if(a%10==3){
                            sb.append(" ");
                            sb.append(a);
                    }
                    while(b!=0){
                        if(b%10==3){
                            sb.append(" ");
                            sb.append(a);
                        }
                        b = a/10;
                    }
                a++;
            }
        }
        System.out.println(sb);
    }
}