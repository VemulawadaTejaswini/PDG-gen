import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int i;
    int count;
    for(i=0,count=0;i<=2;i++){
      if(s.charAt(i)==t.charAt(i)){
        count = count+1;
      }
    }
    System.out.println(count);
  }
 }