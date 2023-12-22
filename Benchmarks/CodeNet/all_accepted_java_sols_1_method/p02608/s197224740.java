import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		double n = sc.nextDouble();
        int a = (int)n;
        int b = (int)Math.sqrt(a);
        int i,j,k;
        int v;
        int ans = 0;
        int last[] = new int[a];
      
      
        for(i = 1;i<=b; i++){
         
          for(j = 1; j <=b; j++){
          	for(k = 1; k <= b; k++){
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