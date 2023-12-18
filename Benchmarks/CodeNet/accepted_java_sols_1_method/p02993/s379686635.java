import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ss[] = new String[4];
    for(int i = 0;i<4;i++){
      ss[i] = s.substring(i,i+1);
    }
    for(int i = 0;i<3;i++){
      if(ss[i].equals(ss[i+1])){
        System.out.println("Bad");
        return ;
      }
    }
    System.out.println("Good");
  }
}
