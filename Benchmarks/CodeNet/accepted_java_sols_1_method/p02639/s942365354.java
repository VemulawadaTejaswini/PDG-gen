import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		// 読み込み
		Scanner sc = new Scanner(System.in);
      	int N = 5;
      	int x[] = new int[5];
      	int ans = 0;
	      for (int i=0; i<N; i++){
            x[i] = sc.nextInt();
            if(x[i] == 0){
            	ans = i + 1;
            }
    	    }
      	      	
         System.out.println(ans);
	}
}