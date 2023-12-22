import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] li = new int[N];
    int[] num = new int[N+1];
    num[0] = 0;
    for(int i=0;i<N;i++){
      li[i] = sc.nextInt();
      num[li[i]] = i+1;
    }
    for(int j=1;j<=N;j++){
      System.out.print(num[j]+" ");
    }
  }
}