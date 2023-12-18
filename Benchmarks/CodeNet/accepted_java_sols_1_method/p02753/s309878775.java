import java.util.*;
import java.lang.*;
public class Main{
public static void main(String [] args){
Scanner in = new Scanner(System.in);
  String s = in.next();
  
  for(int i =0;i<s.length()-2;i++){
  if(s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2)){
  System.out.print("No");
  }
    else{
      System.out.print("Yes");
    }
  }
}
}