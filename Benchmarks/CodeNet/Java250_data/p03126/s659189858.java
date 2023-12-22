import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count[] = new int[m+1];
		
		for(int i=0;i<n;i++){
		    int k = sc.nextInt();
	        for(int j=0;j<k;j++){
	            int a = sc.nextInt();
	            count[a] = count[a]+1;
	            
	        }

		}
		int total =0;
        for(int i=0;i<=m;i++){
            int result = count[i];
            if(result ==n){
                total++;
            }
        }

        System.out.println(total);
 
	}
}