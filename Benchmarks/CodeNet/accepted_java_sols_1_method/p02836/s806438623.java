import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    char[] c = s.toCharArray();
    int l = c.length;
    int count = 0;

    for(int i=0;i<l/2;i++){
      if(c[i]!=c[l-1-i]){
        count += 1;
      }
    }

    System.out.println(count);

  }
}