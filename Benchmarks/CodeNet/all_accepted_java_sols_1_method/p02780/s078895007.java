import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();  //ダイスの合計
    int K = sc.nextInt();  //振るダイスの数
    int[] p = new int[N];
    for(int i =0; i<K-1; i++)
     p[i] = sc.nextInt();
    double maxAverage = 0;
    double beforeAverage = 0;
	
    //期待値が最大となる組み合わせを探す
    for(int i=0; i< N - (K - 1); i++){
      	p[i + (K-1)] =sc.nextInt();
        double average = 0;
        if(i ==0){
        for(int j=0; j<K; j++)
           average += (p[i+j] + 1) / 2.0;
        }else{
            average = beforeAverage - (p[i -1]+1)/2.0 + (p[i+(K-1)]+1)/2.0;
            //1個前を消してケツを追加
        }
        beforeAverage = average;
        if(maxAverage < average) maxAverage = average;
    }
    System.out.println(maxAverage);
  }
}
