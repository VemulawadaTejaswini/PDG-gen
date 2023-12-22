import java.util.Scanner;
public class Main{
  public static void main(String[] arsgs){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    String ans = "APPROVED";
    for (int i = 0; i < n; i++){
      a[i] = Integer.parseInt(sc.next());
    }
    for(int i  = 0; i < n; i++){
      if((a[i]%3 != 0) && (a[i]%5 != 0) &&(a[i]%2 == 0)){
        ans = "DENIED";
      }
    }
    System.out.println(ans);
  }
}