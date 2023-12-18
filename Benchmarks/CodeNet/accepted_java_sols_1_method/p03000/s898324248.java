import java.util.*;
public class Main {

  public static void main (String[] args) {
	
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int[] L = new int[N+1];
  
    L[0] = 0;
    for (int i = 1; i <= N; i++) {
      L[i] = L[i-1] + sc.nextInt();
    }
    sc.close();

    int count = 0;
  
    if(L[N] <= X){
      count = N+1;
    } else {
      for (int i = 0; i <= N; i++) {
        if(L[i] <= X){
          count++;
        }
      }
    }
    
    System.out.println(count);

  }

}