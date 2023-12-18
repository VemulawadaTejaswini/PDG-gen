import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] vote = new int[N];
    int sum = 0;
    for(int i=0; i<N; i++){
      int tmp = sc.nextInt();
      vote[i] = tmp;
      sum += tmp;
    }
    double AVG = sum*(1d/(4*M));
    int cnt = 0;
    for(int i=0; i<N; i++){
      if(vote[i] >= AVG){
        cnt++;
      }
    }
    if(cnt<M){
      System.out.print("No");
    }else{
      System.out.print("Yes");
    }
  }
}
    
    
