import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        int i,j,k,g;
        int ans = 0;
        int last[] = new int[a];
        
        for(g = 1;g <= a; g++ ){
           ans = 0;
        for(i = 1;i<=a; i++){
         
          for(j = 1; j <=a; j++){
          	for(k = 1; k <= a; k++){
              if(g == i*i + j*j + k*k + i*k + j*k + i*j){
                ans += 1;
              }
            }
          }

        }
           last[g - 1] = ans;
        }
        
        for(i = 0;i < a; i++){
          System.out.println(last[i]); 
        }
      
 
    }
}