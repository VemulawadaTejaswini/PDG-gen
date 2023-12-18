import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		int l = sc.nextInt();
      	int r = sc.nextInt();
		int d = sc.nextInt();
      	int kaisuu = 0;
      
        for(int count = l; count <= r; count++){
        	if(count % d == 0){
            	kaisuu+=1;
            }        
        }

			System.out.println(kaisuu);
		
	}
}