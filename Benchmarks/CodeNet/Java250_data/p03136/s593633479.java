import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N =sc.nextInt();
      
      int max =0;//aの中の最大値
      int b = 0;//合計
      for(int i=0; i<N; i++){
      int a =sc.nextInt();
        b = b+a;//入力したであろう値を合計している
        max = Math.max(max,a);//aの中の最大値
      }
      if(max<b-max){
      System.out.println("Yes");
      }
      else{
      System.out.println("No");
      }
    }
}