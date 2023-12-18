import java.io.*;
import java.util.*;

public class Main{
 public static void main(String[] args){
  try{
   
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int n = Integer.parseInt(br.readLine());
   String[] str = br.readLine().split(" ");
   ArrayList<Integer> num = new ArrayList<Integer>();
   
   for(int i = 0; i < str.length; i++){
	num.add(Integer.parseInt(str[i]));
   }
   Collections.sort(num);
   
   int sum = 0;
   for (int value: num){
	sum = sum + value;
   }
  System.out.println(num.get(0) + " " + num.get(str.length-1) + " " + sum);
  }catch(IOException e){
   System.out.println(e);
  }
 }
}