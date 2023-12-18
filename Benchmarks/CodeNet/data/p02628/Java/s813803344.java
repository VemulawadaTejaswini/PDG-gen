import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int K =sc.nextInt();
    int P[]=new int[N];
    for(int i=0;i<N;i++){
      P[i]=sc.nextInt();}
    Arrays.sort(P);
    int ans =0;
    for(int j=0;j<K;j++){
      ans =ans +P[j];}
    System.out.println(ans);
  }
}