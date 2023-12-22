import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    //条件１
    boolean j1 = false;
    if('A' == s.charAt(0)){
      j1 = true;
    }
    
    //条件２
    boolean j2 = false;
    for(int i = 2 ; i < s.length()-1 ; ++i){
      if('C' == s.charAt(i) && j2 == false){
        j2 = true;
      }else if('C' == s.charAt(i) && j2 == true){
        j2 = false;
        break;
      }
    }

    //条件３
    boolean j3 = false;
    for(int i = 0 ; i < s.length() ; ++i){
      if('A' == s.charAt(i)){
        j3 = true;
      }else if('C' == s.charAt(i)){
        j3 = true;
      }else if(Character.isUpperCase(s.charAt(i))==false){
        j3 = true;
      }else{
        j3 = false;
        break;
      }
    }
    
    if(j1&&j2&&j3){
      System.out.println("AC");
    }else{
      System.out.println("WA");
    }
    
  }
}