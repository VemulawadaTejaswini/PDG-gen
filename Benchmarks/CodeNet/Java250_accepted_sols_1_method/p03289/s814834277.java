import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int c = 0;
    boolean flag = true;
    if(s.charAt(0)!='A'){
      flag = false;
    }
    for(int i=2;i<s.length()-1;i++){
      if(s.charAt(i) == 'C'){
        c++;
      }else if(Character.isUpperCase(s.charAt(i))){
        flag = false;
        break;
      }
    }
    if(Character.isUpperCase(s.charAt(1))){
      flag = false;
    }
    if(Character.isUpperCase(s.charAt(s.length()-1))){
      flag = false;
    }
    if(flag && c==1){
      System.out.println("AC");
    }else{
      System.out.println("WA");
    }
  }
}
