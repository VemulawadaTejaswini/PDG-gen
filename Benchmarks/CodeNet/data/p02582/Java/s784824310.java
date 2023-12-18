import java.util.*;
import java.io.*;
public class Problem{
 static Scanner sc = new Scanner(System.in); 
public static void main(String[] argh){
  String[] str = sc.nextLine().split("");
  int count = 0;
  for(String s : str){
    if(s.equals("R"))count++;
}
  System.out.println(count);
}