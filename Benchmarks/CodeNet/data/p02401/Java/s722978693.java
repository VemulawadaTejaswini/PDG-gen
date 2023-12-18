import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String s = br.readLine();
            String[] str = s.split(" ");
            int a = Integer.parseInt(str[0]);
            String op = str[1];
            int b = Integer.parseInt(str[2]);
            //System.out.println(a+op+b);
            if("+".equals(op)){
                
                System.out.println(a + b);
                
            }
            else if("-".equals(op)){
                
                System.out.println(a - b);
                
            }
            else if("*".equals(op)){
                
                System.out.println(a * b);
                
            }
            else if("/".equals(op)){
                
                System.out.println(a / b);
                
            }
            else if("?".equals(op)){
                
               break;
                
            }
        }
    }
}