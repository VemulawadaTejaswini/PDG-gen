import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[] Array = new int[N];
        int count = 0;
        int flg = 0;
      
        for(int i=0; i<N; i++){
          Array[i] = sc.nextInt();
        }
      
      
      while(flg < 1){
      	for(int j=0; j<N; j++){
          if(Array[j]%2 == 0){
            Array[j] /= 2;
            if(j == N-1){
              count++;
            }
          }else{
         	flg = 100;
            break;
          }
        }
      }
      
        System.out.println(count);
    }
}
