import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str = s.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        if(!(a<1) || (b>Math.pow(10,9))){
            
            int num1 = a / b;
            int num2 = a % b;
            String num3 = String.format("%.5f",((double)a / (double)b));
            System.out.println(num1+" "+ num2 +" "+ num3);
            
            //System.out.println(String.format("%d %d %.5f",a/b,a%b,(double)a/b));
        }
    }
}