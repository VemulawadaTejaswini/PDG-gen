import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
  	    int m = sc.nextInt();
        int K[] = new int[n];
      	int A[][] = new int[n][m]; 
      	int fav[] = new int[m];
      	int ans = 0;
        
        for(int i=0; i<n; i++){
            K[i] = sc.nextInt();
            for(int j=0; j<K[i] ; j++){
                A[i][j] = sc.nextInt();
			    fav[A[i][j]-1] += 1;
     	    }
        }
      	
      	for(int i=0; i<m; i++){
            if(fav[i] == n){
                ans++;
            }
        }
       	
       	System.out.println(ans);
    }
}