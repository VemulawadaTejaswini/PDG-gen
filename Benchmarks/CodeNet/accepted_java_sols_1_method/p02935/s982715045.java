import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      
      double a[] =new double[N];//入力する値を格納する
      
      for(int i=0; i<N; i++){
      a[i] = sc.nextInt();
      }
      
      Arrays.sort(a);//入力した値を小さい順から並べる
      
      double min = a[0];//最小の値を決めておく

      for(int j=1; j<N; j++){
      min = (min+a[j])/2;//小さい値から足して計算していけば,最大値を出せる
      }                  //min=(200+a[1]==300)/2,250=(250+a[2]==500)/2...繰り返し...
      System.out.println(min);
    }
}