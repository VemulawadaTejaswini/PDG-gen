import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b[] = new int[a];
      for(int i = 0; i < a; i++){
      	b[i] = sc.nextInt();
      }
      boolean c[] = new boolean[a];
      for(int i = 0;i < a;i++){
      	for(int j = 0;j < a;j++){
        	if(!c[i]){
            	if(i != j){
                	if(b[i] % b[j] == 0){
                    	c[i] = true;
                    }
                }
            }
        }
      }
      int d = 0;
      for(int i = 0; i < a;i++){
      	if(!c[i]){
        	d++;
        }
      }
      // 出力
		System.out.println(d);
	}
}