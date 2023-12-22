import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        int m = sc.nextInt();
        int k[] = new int[n];
        int a[][] = new int[n][m];
        int love[] = new int[m];
        int i,j;
        int count = 0;
        for(i = 0;i < n;i++){
          k[i] = sc.nextInt();
           for(j = 0;j < k[i];j++){          
             a[i][j] = sc.nextInt();
             love[a[i][j] - 1] += 1;
           }
        }
		
      
        for(i = 0;i < m;i++){
          if(love[i] == n){
            count += 1;
          }
        }
        System.out.println(count); 
      
 
 
    }
}