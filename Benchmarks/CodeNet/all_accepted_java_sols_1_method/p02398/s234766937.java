import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str = s.split(" ");
        int x=0;
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        //System.out.println(a+" " + b +" "+ c);
        
        if(!(a<1 || a>10000) || (b<1 && b>10000) || (c<1 && c>10000) || (a>b)){
            for(; a<=b; a++){
                //System.out.println(a);
                if(c % a == 0){
                    x++;
                }
            }
            System.out.println(x);
        }
    }
}