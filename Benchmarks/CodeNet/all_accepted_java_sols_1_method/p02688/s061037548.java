import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int K = sc.nextInt();
        int[] check = new int[N];
        int counter = 0;
        
        for(int q=0; q<N; q++){
          check[q] = -1;
        }
      
      	for(int i=0; i<K; i++){
          int d = sc.nextInt();
            for(int j=0; j<d; j++){
              int a = sc.nextInt();
              check[a-1] = 0;
            }
        }
      
		for(int r=0; r<N; r++){
          if(check[r] == -1){
            counter++;
          }
        }
      
        System.out.println(counter);
    }
}
