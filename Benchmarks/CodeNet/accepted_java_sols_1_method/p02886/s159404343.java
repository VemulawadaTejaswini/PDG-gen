  import java.util.*;
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		// 整数の入力
    		int n = sc.nextInt();
          	int[] a = new int[n];
          
          	for (int i = 0; i<a.length; i++){
              a[i] = sc.nextInt();
            }
          
            int result = 0;
          	for (int i = 0; i<a.length; i++){
              for (int j = 0; j<a.length; j++){
                if(i != j){
                  result += a[i] * a[j];
                }                  
              }
            }
          	
          	result = result / 2;
              
          
    		// 出力
    		System.out.println(result);
    	}
    }