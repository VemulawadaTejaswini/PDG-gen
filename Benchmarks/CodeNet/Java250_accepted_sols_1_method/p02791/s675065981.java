import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int A[] = new int[N];
    for(int i=0;i<N;i++){
      A[i] = Integer.parseInt(sc.next());
    }
    int cnt = 1;
    int min = A[0];
    for(int i=1;i<N;i++){
      if(min >= A[i]){
        cnt++;
        min = A[i];
      }
    }

    System.out.println(cnt);

  }
}

