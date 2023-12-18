import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1=0,num2=0,num3=0;
        String s=br.readLine();
        int x = Integer.parseInt(s);
        if(x>=0 && x<86400){
            num1 = x / 3600; //??????????±???????
            num2 = (x % 3600) / 60; //???????±???????
            num3 = x % 60; //?§?????±???????
            System.out.println(num1+":"+num2+":"+num3);
        }
        
    }
}