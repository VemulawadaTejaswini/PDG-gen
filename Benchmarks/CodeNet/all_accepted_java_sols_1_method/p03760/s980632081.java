import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a[] = sc.next().split("");
    String b[] = sc.next().split("");
    for (int i = 0; i < b.length; i++){
      System.out.printf("%s%s", a[i], b[i]);
    }
    if (a.length > b.length){
      System.out.print(a[a.length-1]);
    }
  }
}
