import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //N種類の商品
    int M = sc.nextInt(); //M個を選ぶ
    int[] A = new int[N]; //得票数
    int sum = 0; //総投票数
    int cnt = 0; //許容選択数
    String S = ""; //空
    
      for(int i=0; i<N; i++) { //商品 i
        A[i]=sc.nextInt(); 
        sum += A[i];
      }
      for(int i=0; i<N; i++){
        if(A[i]*4*M >= sum){
          cnt++;
        } 
      }
      if(cnt>=M) {
        S="Yes";
      } else {
        S="No";
      }
    System.out.println(S);
  }
}