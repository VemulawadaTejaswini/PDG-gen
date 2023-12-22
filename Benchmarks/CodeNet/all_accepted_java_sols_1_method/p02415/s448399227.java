import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char c;
    for(int i= 0;i < s.length();i++){
      c = s.charAt(i);
      if(c >= 'A' && c <= 'Z'){
        c += 'a'-'A';
      }else if(c >= 'a' && c <= 'z'){
        c += 'A'-'a';
      }
      System.out.print(c);
    }
    System.out.println("");
    sc.close();
  }
}

