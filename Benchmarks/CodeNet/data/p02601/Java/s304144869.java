import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
      	int k = sc.nextInt();

        for(int i = 0; i < k ; i++){
        	if(a>=b){
            	b = b * 2;
            }else{
            	c = c * 2;
            }
        
        }
		if(a < b && b <c){
			// 出力
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
}