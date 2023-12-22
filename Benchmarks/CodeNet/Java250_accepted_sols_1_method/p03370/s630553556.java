import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int m[] = new int[N];
    int answer =0;
    for(int i=0;i<N;i++){
      m[i]=sc.nextInt();
      X=X-m[i];
      answer++;
    }
    Arrays.sort(m);
    answer = answer + X/m[0];
    System.out.println(answer);
    
  }
  

  
}