import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

      //入力
      int N =sc.nextInt();//リンゴの数
      int L =sc.nextInt();
      
      int app[] =new int[N];//リンゴの味
      int pie[] =new int[N];//アップルパイの味
      
      int sum =0;//作る予定だったアップルパイの味
      
      //作る予定だったアップルパイの味を求める
      for(int i=0; i<N; i++){
      	app[i] = L+i;
        sum += app[i];
      }
      
      //作る予定だったアップルパイの味から
      //食べてしまったリンゴの味を引いたアップルパイの味を求める
      for(int i= 0; i<N; i++){
      	pie[i] = sum-app[i];
      }
      
      //作る予定だったアップルパイの味と
      //食べてしまったリンゴの味を引いたアップルパイの味の差の初期値
      int diff =0;
      
      //求める答え
      int ans =0;
      
      //差の絶対値が最小のものを求める
      for(int i=0; i<N; i++){
      	int min = Math.abs(sum-pie[i]);
        
         if(i == 0 ||diff > min){
         	diff = min;//条件が合えば最小を更新する
           	ans = pie[i];
         }
      }
      		System.out.println(ans);
    }
}   