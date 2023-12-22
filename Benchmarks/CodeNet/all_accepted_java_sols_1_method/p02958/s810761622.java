import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] p = new int[N];
    
    int cnt = 0;
    
    for (int i=0; i<N;i++){
      p[i] = sc.nextInt();
      if (p[i] != (i+1)){
        cnt++;
      }
      if (cnt >= 3){
        System.out.println("NO");
        return;
      }
    }
    
    System.out.println("YES");
  }
}