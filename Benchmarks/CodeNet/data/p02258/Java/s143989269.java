import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int R[] = new int[N];
    int maxv = -2000000000;
    for(int i=0;i<N;i++){
      R[i] = sc.nextInt();
    }
    int minv = R[0];
    for(int j=1;j<N;j++){
      maxv = Math.max(maxv,R[j]-minv);
      minv = Math.min(minv,R[j]);
    }
    System.out.println(maxv);
  }
}
