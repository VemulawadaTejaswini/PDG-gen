import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int count = 0;
    for(int i = 0;i<s.length();i++){
      if(s.substring(i,i+1).equals(t.substring(i,i+1))){

      }else{
        count++;
      }
    }
    System.out.println(count);
  }
}
