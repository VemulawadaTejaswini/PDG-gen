import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] num = new int[M*2];
    int[] count = new int[N];

    for(int i=0; i < M*2; i++){
        num[i] = sc.nextInt();
        count[num[i]-1]++;
    }
    for(int i=0; i < N; i++){
        System.out.println(count[i]);
    }
  }
}