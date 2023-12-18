import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int x[] = new int[N];
    for(int i=0;i<N;i++){
      x[i]=sc.nextInt();
    }
    int answer =0;
    for(int i=0;i<N;i++){
      answer = answer + 2*Math.min(Math.abs(x[i]-K),x[i]);
    }
    System.out.println(answer);
  }
  

  
}
