import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();
    for(char a:c){
      for(int i = 0;i<n;i++){
        a++;
        if(a==91)a=65;
      }
      System.out.print(a);
    }
    System.out.println("");

  }
}
