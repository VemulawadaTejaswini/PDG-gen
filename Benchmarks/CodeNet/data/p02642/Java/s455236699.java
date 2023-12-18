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
	Arrays.sort(b);

      boolean c[] = new boolean[a];
      for(int i = 0;i < a;i++){
      	for(int j = 0;j < i;j++){
        	if(!c[i]){
            	if(b[i] % b[j] == 0){
                	c[i] = true;
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
    if(b[0] == b[1]){
    	d--;
    }
    for(int i = 1;i < a -1;i++){
    	if(b[i - 1] != b[i] && b[i] == b[i + 1]){
        	d--;
        }
    }
    
      // 出力
		System.out.println(d);
	}
}