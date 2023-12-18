import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ans = 0;
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int cnt = 0; cnt < n; cnt++){
      a[cnt] = sc.nextInt();
    }
    while(true){
      for(int cnt = 0; cnt < a.length ; cnt++){
        if(a[cnt] % 2 == 0){
          a[cnt] /= 2;
        }
        else{
          System.out.println(ans);
          return;
        }
      }
      ans++;
    }
  }
}