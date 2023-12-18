import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      int A = scanner.nextInt(); // 1 =< A,B =< 100
      int B = scanner.nextInt();
      int C = scanner.nextInt();  // nA = mB +C, 0 =< C < B
      
      int target = A;
      boolean exist = false;
      for(int counter=0; counter<B; counter++){
        if(target%B == C){
          exist = true;
          break;
        }
        target += A;
      }
      
      if(exist){
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
      
    }
}