import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
      int X = scan.nextInt();
      int N = scan.nextInt();
      int pn[] = new int[N];
      for(int i=0; i<N; i++){
        pn[i] = scan.nextInt();
      }
      int ans1 = X;
      int ans2 = X;
      int x = X;
      
      while(true){
        for(int i=0; i<N; i++){
           if(x == pn[i]){
             ans1 = 200;
             break;
           }else
             ans1 = x;
        }
        if(ans1 == x)
          break;
        x -= 1;
      }
      x = X;
      while(true){
        for(int i=0; i<N; i++){
           if(x == pn[i]){
             ans2 = 200;
             break;
           }else
             ans2 = x;
        }
        if(ans2 == x)
          break;
        x += 1;
      }
      
      if(X-ans1 > ans2-X)
        System.out.println(ans2);
      else
        System.out.println(ans1);
   }
}