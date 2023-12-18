import java.util.*;
import java.io.*;

public class Main{
     public static void main(String[] args){
InputStreamReader is = new InputStreamReader(System.in);       
   BufferedReader br = new BufferedReader(is);

int x = 0;

try{
String str = br.readLine();
                x = Integer.parseInt(str);

 }catch(IOException e){}

double i = Math.pow(x, 3);

int num = (int)i;
System.out.println(num);




}
}