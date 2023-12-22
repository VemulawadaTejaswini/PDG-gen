import java.util.Scanner;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int X = sc.nextInt();
      int N = sc.nextInt();
      HashSet set = new HashSet();
      if(N == 0){
        System.out.println(X);
      } else {
        for(int i = 0; i < N; i++) set.add(sc.nextInt());
        int ans = X;
        for(int i = 1; i < 100; i++){
          if(!set.contains(X)) break;
          if(!set.contains(X - i)) {
            ans = X-  i;
            break;
          }
          if(!set.contains(X + i)) {
            ans = X + i;
            break;
          }
        }
        System.out.println(ans);
      }
      
    } 
}