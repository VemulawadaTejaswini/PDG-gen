import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int count = 0;
    int[] h = new int[N];
    
    for(int i=0; i<N; i++){
        h[i] = sc.nextInt();
        if(h[i] >= K){
            count++;
        }else{
        }
    }
    
    System.out.println(count);
  }
}