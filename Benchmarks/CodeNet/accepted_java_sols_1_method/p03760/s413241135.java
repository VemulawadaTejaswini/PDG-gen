import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  String a = sc.next();
  String b = sc.next();
  if(a.length() > b.length()){
    for(int i = 0;i < a.length()-1;i++){
      System.out.print(a.charAt(i));
      System.out.print(b.charAt(i));
    }
    System.out.println(a.charAt(a.length()-1));
  }
  else{
    for(int i = 0;i < a.length();i++){
      System.out.print(a.charAt(i));
      System.out.print(b.charAt(i));
    }
  }
}}