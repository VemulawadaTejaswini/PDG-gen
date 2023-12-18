import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int count =0;
    boolean isW=false;
    for(int i=0;i<s.length();i++){
    //  System.out.println(s.charAt(i));
      if(s.charAt(i)=='R'){
     //   System.out.println("anuj");
        if(isW==true){
          count++;
        }
      }
      else if(s.charAt(i)=='W'){
        isW=true;
      }
    }
    if(s.charAt(0)=='W' && s.charAt(1)=='R' && count>1){
      count--;
    }
      System.out.println(count);
  }
}