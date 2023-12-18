import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      //取得
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();
      int i = 1;
      //どちらかが体力なくなるまで対戦
      //奇数回は高橋の攻撃
      while(A>0 && C>0){
        if(i%2==1){
          C-=B;
        }else{
          A-=D;
        }
        i++;
      }
      //高モンの体力は？
      if(A>0){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}