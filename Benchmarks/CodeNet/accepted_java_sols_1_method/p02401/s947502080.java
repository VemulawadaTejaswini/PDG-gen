import java.util.*;
import java.io.*;

public class Main{
 public static void main(String[] args) throws IOException
 {
   InputStreamReader is = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(is);

   String inStr = br.readLine();
   String[] sp = inStr.split(" ");

   int a = Integer.parseInt(sp[0]);
   char[] op = sp[1].toCharArray();
   int b = Integer.parseInt(sp[2]);

   while(op[0] != '?'){
    switch(op[0]){
        case '+':
            System.out.println(a+b);
            break;
        case '-':
            System.out.println(a-b);
            break;
        case '*':
            System.out.println(a*b);
            break;
        case '/':
            System.out.println(a/b);
            break;
        default:
            break;
    }
   inStr = br.readLine();
   sp = inStr.split(" ");

   a = Integer.parseInt(sp[0]);
   op = sp[1].toCharArray();
   b = Integer.parseInt(sp[2]);
   }
 }
}