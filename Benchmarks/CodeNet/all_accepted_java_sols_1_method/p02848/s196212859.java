import java.util.*;

public class Main {
  static final String ascii = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int index = sc.nextInt();
    String str = sc.next();
    
    if (index == 0){
      System.out.println(str);  
    }else {
    
      String replaced = "";
      for (int i = 0 ; i < str.length() ; i++){
        char c = str.charAt(i);
        int si = ascii.indexOf(String.valueOf(c));
        int ri = si + index;
        if(ri >= ascii.length()){
          ri = ri - ascii.length();
        }
        replaced = replaced + String.valueOf(ascii.charAt(ri));
      }
      System.out.println(replaced);
    }
  }
}