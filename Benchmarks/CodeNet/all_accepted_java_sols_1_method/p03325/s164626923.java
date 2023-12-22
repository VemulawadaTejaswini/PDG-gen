import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int answer = 0;

    for(int i = 0; i<N; i++){
      //以下をN回繰り返す
      int a =sc.nextInt();
      while(a%2 == 0){
        //「aが偶数」が真である間
        a /= 2;
        //aにa/2を代入して
        answer++;
        //answerを1増やす
      }
    }
    System.out.println(answer);
  }
}
