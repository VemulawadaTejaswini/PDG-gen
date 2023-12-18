import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
		int N = sc.nextInt();
      	
      	for(int i = 0;i<N;i++){
          int count = 0;

          for(int j = 0;j < Math.sqrt(N);j++){
            for(int k = 0;k < Math.sqrt(N);k++){
              for(int l = 0;l < Math.sqrt(N);l++){
                if(Math.pow(j, 2) + Math.pow(k, 2) + Math.pow(l, 2) + j*k + k*l + l*j == N){
                  	count ++ ;
                	System.out.println(count);	
                }
              }
            }
          }
          }
    }
}