import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n  =sc.nextint();
    int k = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }
	if( n <= k) {
      for(int i = 0; i < n; i++){
        System.out.print(n + " ");
      }
    }
  }
}
