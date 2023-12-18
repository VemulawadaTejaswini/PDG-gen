import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	long k = sc.nextLong();
      	long[] aN = new long [a];
      	long[] bN = new long [b];
      	long[] aSum = new long [a];
      	long[] bSum = new long [b];
      	int aPos = 0;
      	int bPos = 0;
      	long ans = 0;
      	for(int i=0;i<a;i++){
          aN[i] = sc.nextLong();
          aSum[i] = aN[i];
          if( i > 0 ){
            aSum[i] += aSum[i-1];
            if( aSum[i] > k || aSum[i-1] == -1 ){
              aSum[i] = -1;
            }else{
              aPos = i;
            }
          }
        }
        for(int i=0;i<b;i++){
            bN[i] = sc.nextLong();
            bSum[i] = bN[i];
            if( i > 0 ){
              bSum[i] += bSum[i-1];
              if( bSum[i] > k || bSum[i-1] == -1 ){
                bSum[i] = -1;
              }else{
                bPos = i;
              }
            }
          }
      	for(int i=aPos;i>-1;i--){
          for(int j=bPos;j>-1;j--){
            if( i + j + 2 < ans ){
              break;
            }
            if( aSum[i] + bSum[j] <= k ){
              if( i + j + 2 > ans ){
                ans = i + j + 2;
              }
            }
          }
        }
          
      	System.out.println(ans);
	}
}