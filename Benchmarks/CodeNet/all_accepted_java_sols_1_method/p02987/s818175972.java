import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String s1[] = s.split("");
    Arrays.sort(s1);
    if (!(s1[0].equals(s1[3]))){
      if (s1[0].equals(s1[1]) && s1[2].equals(s1[3])){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }else{
      System.out.println("No");
    }
  }
}
