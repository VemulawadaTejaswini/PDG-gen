import java.io.*;
import java.util.*;

class Main{
 public static void main(String args[]){
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  try{
   String input_str;
   while((input_str = br.readLine()) != null){
    String[] input_strs = input_str.split(" ");
    int a = Integer.parseInt(input_strs[0]);
    int b = Integer.parseInt(input_strs[1]);
    System.out.println(a + b);
   }
  }catch(Exception e){
   System.out.println("Error");
  }
 }
}