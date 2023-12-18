import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = null;
      sc = new Scanner(System.in);
      int A = sc.nextInt();
      int V = sc.nextInt();
      int B = sc.nextInt();
      int W = sc.nextInt();
      int T = sc.nextInt();
      boolean flag = false;
      
      for(int i=1; i <= T; i++){
        if(A+(V*i) == B+(W*i)){
          flag = true;
          break;
        }
      }
      if(flag){
         System.out.println("YES");
      }else{
         System.out.println("NO");
      }
    }
}