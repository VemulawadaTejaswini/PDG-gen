import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      
      int count = 0;
      for(int x = 1; x <= N;x++){
        for(int y =1; y <= N; y++){
          for(int z = 1; z <= N; z++){
            if(x*x + y*y + z*z + x*y + y*z + z*x == N){
              count++;
            }
          }
        }
      }
      System.out.println(count);
    }
}