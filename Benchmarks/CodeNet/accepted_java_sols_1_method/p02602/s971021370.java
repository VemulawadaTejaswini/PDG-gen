import java.util.*;
public class Main {
  	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();
      int a[] = new int[N];
      for (int count = 0; count < N; count++){
  	    a[count] = sc.nextInt();
      }
      for (int count = 0; count < N-K; count++){
        if(a[count] < a[count+K]){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      }
    }
}