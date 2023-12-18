import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		int n = sc.nextInt();
      	for (int i = 1; i <= n; i++) {
          int keisannkekka = 0;
          for (int x = 1; x <= i; x++) {
              for (int y = 1; y <= i ; y++) {
                  for (int z = 1; z <= i ; z++) {
                  	if((x*x)+(y*y)+(z*z)+(x*y)+(y*z)+(z*x)== i){
						keisannkekka += 1;
                  	}
                  }
              }
          }
          System.out.println(keisannkekka);
        }
      
			
		
	}
}