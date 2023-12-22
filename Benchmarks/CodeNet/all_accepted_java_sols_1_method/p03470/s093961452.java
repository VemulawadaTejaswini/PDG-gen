import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int d[] = new int[N];
    for(int i=0;i<N;i++){
      d[i]=sc.nextInt();
    }
    Arrays.sort(d);
    int answer =1;
    for(int i=0;i<N-1;i++){
      if(d[i]!=d[i+1]){
        answer=answer+1;
      }
    }
    System.out.println(answer);
  }
  

  
}