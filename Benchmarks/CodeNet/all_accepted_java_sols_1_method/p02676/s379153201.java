import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();
    StringBuilder val = new StringBuilder();

    if(k>=c.length){
      System.out.println(s);
    }else{
      for(int i=0; i<k; i++){
        System.out.print(c[i]);
      }
      System.out.println("...");
    }


  }
}