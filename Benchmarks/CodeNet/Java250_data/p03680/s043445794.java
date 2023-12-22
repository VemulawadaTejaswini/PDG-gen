import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int a[] = new int[N+1];
    
    for(int i = 1; i <= N; i++){
      a[i] = sc.nextInt();
    }
    
    int cnt = 1;
    int point_now = 1;
    
    while(cnt <= N){
      point_now = a[point_now];
      if(point_now == 2){
        System.out.print(cnt);
        return;
      }
      cnt++;
    }
    System.out.println(-1);
  }
}
    