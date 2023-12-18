import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();  //候補地点の数
    int T = sc.nextInt();  //基礎気温 ある地点の気温はT-H[]*0.006
    int A = sc.nextInt();  //理想とする気温
    int[] H = new int[N];  //候補地点ごとの高度
    int number = 0; //理想の候補地点の番号
    double x = 1000.0; //理想の差の絶対値
    for(int i = 0; i < N; i++)
      H[i] = sc.nextInt();
    
    for(int i = 0; i < N; i++){
      double xi = A - (T - H[i] * 0.006);
        if(xi < 0) xi = -xi;
      if(xi < x){ x = xi; number = i + 1;}     
    }
    System.out.println(number);
  }  
}
