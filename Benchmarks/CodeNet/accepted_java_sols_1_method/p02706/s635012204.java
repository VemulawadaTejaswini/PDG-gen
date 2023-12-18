import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int nday = sc.nextInt();
    int m = sc.nextInt();
    for(int i = 0 ; i < m; i++){
      nday -= sc.nextInt();
    }
    System.out.println(Math.max(nday, -1));
  }
}