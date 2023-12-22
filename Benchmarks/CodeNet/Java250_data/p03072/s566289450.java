import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] H = new int[N];
    int sum = 0;

    for(int i=0;i<N;i++){
      H[i] = sc.nextInt();
    }

    int anxis = H[0];
    for(int i=0;i<N;i++){
      if(anxis <= H[i]){
        anxis = H[i];
        sum+=1;
      }
    }
    System.out.println(sum);
  }
}