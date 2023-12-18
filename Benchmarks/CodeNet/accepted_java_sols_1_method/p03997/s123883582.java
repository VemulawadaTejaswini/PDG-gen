import java.util.*;

class Main{
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt(), h = sc.nextInt();
    sc.close();
    int ans = (a + b) * h / 2;
    System.out.println(ans);
  }
}
