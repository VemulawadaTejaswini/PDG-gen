import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String str = "WA";
    int count = 0;
    boolean f = true;
    int len = a.length();
    if(a.charAt(0) == 'A'){
      for(int i = 2;i < len-1;i++){
        if(a.charAt(i)=='C'){
          count++;
        }else{
          if(Character.isUpperCase(a.charAt(i)))f=false;
        }
      }
    }
    if(Character.isUpperCase(a.charAt(1)))f=false;
    if(Character.isUpperCase(a.charAt(len-1)))f=false;
    if(count == 1 && f)str = "AC";
    System.out.println(str);
  }
}