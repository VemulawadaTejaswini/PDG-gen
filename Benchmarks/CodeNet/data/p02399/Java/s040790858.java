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
            double num3 = (double)a / (double)b;
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }
    }
}