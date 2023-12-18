import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = sc.next();
    String[] rank = s.split("");
    int d = 0;
    int e = 0;
    for (int i = 0; i < n; i++){
      if (rank[i].equals("a") && d < a+b){
        System.out.println("Yes");
        d++;
      }else if ((rank[i].equals("b") && d < a+b) && e < b){
        System.out.println("Yes");
        d++;
        e++;
      }else{
        System.out.println("No");
      }
    }
  }
}