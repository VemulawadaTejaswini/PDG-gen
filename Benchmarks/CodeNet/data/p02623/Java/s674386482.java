import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	long k = sc.nextLong();
      	long[] aN = new long [a];
      	long[] bN = new long [b];
      	long[] aSum = new long [a+1];
      	long[] bSum = new long [b+1];
      	int aPos = 0;
      	int bPos = 0;
      	int ans = 0;
      	for(int i=0;i<a;i++){
          aN[i] = sc.nextLong();
        }
      	for(int i=0;i<b;i++){
          bN[i] = sc.nextLong();
        }
      	
      	aSum[0] = 0;
      	for(int i=0;i<a;i++){
          if( aSum[i] > k ){
            aPos--;
            break;
          }else{
            aPos++;
          }
          aSum[i+1] = aSum[i] + aN[i];
        }
      	
      	bSum[0] = 0;
      	for(int i=0;i<b;i++){
          if( bSum[i] > k ){
            bPos--;
            break;
          }else{
            bPos++;
          }
          bSum[i+1] = bSum[i] + bN[i];
        }
      	
      	if( aPos > bPos ){
          ans = aPos;
        }else{
          ans = bPos;
        }
      
      	for(int i=aPos;i>=0;i--){
          if( ans-i+1>=0 && ans-i+1<=b && aSum[i] + bSum[ans-i+1] <= k ){
            i++;
            ans++;
          }
        }
      	
      	/*
      	for(int i=0;i<aPos+1;i++){
          if( i + bPos <= ans ){
            continue;
          }
          for(int j=ans-i;j<bPos+1;j++){
            if( i + j < ans ){
              continue;
            }
            if( aSum[i] + bSum[j] <= k ){
              if( i + j > ans ){
                ans = i + j;
              }
            }
          }
        }
        */
      	System.out.println(ans);
	}
}