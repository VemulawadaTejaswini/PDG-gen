import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        int i,j,k;
        int v;
        int ans = 0;
        int last[] = new int[a];
      
      
        for(i = 1;i<=a; i++){
         
          for(j = 1; j <=a; j++){
          	for(k = 1; k <= a; k++){
              if(i*i + j*j + k*k + i*k + j*k + i*j <= a){
                v = i*i + j*j + k*k + i*k + j*k + i*j;
                last[v - 1] += 1;
              }
            }
          }
        }
        
        for(i = 0;i < a; i++){
          System.out.println(last[i]); 
        }
      
 
    }
}