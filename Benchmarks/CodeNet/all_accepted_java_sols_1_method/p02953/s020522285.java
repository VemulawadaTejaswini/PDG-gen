import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] h = new int[n];
    for(int i = 0; i < n; i++){
      h[i] = scanner.nextInt();
    }
    
    boolean result = true;
    
    for(int i = n - 1; i > 0; i--){
      if(h[i-1] > h[i] + 1){
        result = false;
      }else if(h[i-1] > h[i]){
        h[i-1]--;
      }
    }

    System.out.println(result ? "Yes" : "No");
  }
}
