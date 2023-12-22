import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int A = sc.nextInt();//1
      int B = sc.nextInt();//0
      int C = sc.nextInt();//-1
      int K = sc.nextInt();//選択された枚数
      
      //Aの枚数で足りるとき
      if(A>=K){
       System.out.print(K);
      }
      //AとBの枚数で足りるとき
      else if((A+B)>=K && K>A){
       System.out.print(A);
      }   
      //Cの枚数で足りるとき
      else {
       System.out.print(A-(K-A-B));
      }
    }
}