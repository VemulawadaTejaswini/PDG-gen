import java.util.*;
  public class Main{
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String t = sc.next();
      char [] a = s.toCharArray();
      char [] b = t.toCharArray();
      if(a[0]==b[0]&&a[1]==b[1]&&a[2]==b[2]){
        System.out.println("3");
      }else if((a[0]==b[0]&&a[1]==b[1])||(a[1]==b[1]&&a[2]==b[2])||(a[0]==b[0]&&a[2]==b[2])){
        System.out.println("2");
      }else if(a[0]==b[0]||a[1]==b[1]||a[2]==b[2]){
        System.out.println("1");
      }else{
        System.out.println("0");
      }
    }
  }