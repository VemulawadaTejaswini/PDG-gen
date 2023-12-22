import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //参加者N人
    int K = sc.nextInt(); //初期ポイントK点
    int Q = sc.nextInt(); //Q回のポイント変動
    int[] a = new int[Q];
    int[] b = new int[N];
    
    for(int i=0;i<Q;i++){
      a[i] = sc.nextInt();
      b[a[i]-1] += 1;
    }
    for(int j=0;j<N;j++){
      if(b[j]>Q-K){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}