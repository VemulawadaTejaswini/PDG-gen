import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    int K=scan.nextInt();
    int[] h=new int[N];
    for(int i=0;i<N;i++){
      h[i]=scan.nextInt();
    }
    int count=0;
    for(int i=0;i<N;i++){
      if(K<=h[i]){
        count++;
      }
    }
    System.out.println(count);
  }
}