import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N;
    N = sc.nextInt();
    int h[] = new int[N];
    boolean exi = false;
    int ans = 0;
    for(int i=0; i<N; i++) h[i] = sc.nextInt();
    for(int i=1; i<=100; i++){
      for(int j=0; j<N; j++){
        if(h[j] >= i){
          if(exi == false){
            ans++;
            exi = true;
          }
        }else{
          exi = false;
        }
      }
      exi = false;
    }
    System.out.println(ans);
                               
  }
}