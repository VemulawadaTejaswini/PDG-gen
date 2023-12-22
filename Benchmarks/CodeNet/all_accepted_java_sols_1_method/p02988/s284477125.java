import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] array = new int[20];
    
    for(int i = 0 ; i < N ; i ++){
      array[i] = sc.nextInt();
    }
    
    boolean flag = false;
    int cnt = 0;
    
    for(int i = 1 ; i < N-1; i++){
      int a = array[i-1];
      int b = array[i];
      int c = array[i+1];
      if(a<b && b<c){
        cnt++;
      }else if(a>b && b>c){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}