import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    boolean j1 = false;
    boolean j2 = false;
    boolean j3 = false;
    boolean j4 = false;
    
    int len = s.length();
    if(len%2 == 1){
      j1 = true;
    }

    for(int i = 0 ; i < len/2 ; ++i){
      if(s.charAt(i) == s.charAt(len-1-i)){
        j2 = true;
      }else{
        j2 = false;
        break;
      }
    }
    for(int i = 0 ; i < len/2 ; ++i){
      if(s.charAt(i) == s.charAt(((len-1)/2)-1-i)){
        j3 = true;
      }else{
        j3 = false;
        break;
      }
    }
    for(int i = 0 ; i < len/2 ; ++i){
      if(s.charAt((len+3)/2-1+i) == s.charAt(len-1-i)){
        j4 = true;
      }else{
        j4 = false;
        break;
      }
    }

    if(j1&&j2&&j3&&j4){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

  }
}