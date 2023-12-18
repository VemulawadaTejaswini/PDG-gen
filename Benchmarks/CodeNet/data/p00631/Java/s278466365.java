import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    new Main();
  }
  public Main(){
    Scanner sc = new Scanner(System.in);
    while(true){
      int n = sc.nextInt();
      if(n==0)break;
      int[] a = new int[n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }
      int ans = 1000000000;
      for(int mask=0;mask<(1<<n);mask++){
        int gonta = 0;
        int ponta = 0;
        for(int i=0;i<n;i++){
          if( ((mask>>i)&1) == 1 ) gonta += a[i];
          else ponta += a[i];
        }
        ans = Math.min(ans,Math.abs(ponta-gonta));
      }
      System.out.println(ans);
    }
  }
}