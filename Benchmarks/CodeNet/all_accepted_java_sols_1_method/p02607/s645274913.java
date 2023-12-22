import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		int n = sc.nextInt();
        int kosuu = 0;
        for(int i = 1; i <= n; i++){
          int a = sc.nextInt();
        	if(i%2 != 0 && a%2 != 0){
                	kosuu += 1;
            }        
        }

			System.out.println(kosuu);
		
	}
}