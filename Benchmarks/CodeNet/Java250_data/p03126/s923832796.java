import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
      	
          int[] food;
      food = new int[M];
      
        for(int k=0;k<M;k++) {
      food[k] = 0;
        }
        
    	for(int i=0;i<N;i++){
        int K = sc.nextInt();
        
        for(int j=0;j<K;j++){
          int F = sc.nextInt();
          
          food[F-1]++;
          }
		}
		int count = 0;
		for(int w=0;w<M;w++){
    	if(food[w] == N) {
    		count++;
    	}   	
    	}
		System.out.println(count);
  	}
}