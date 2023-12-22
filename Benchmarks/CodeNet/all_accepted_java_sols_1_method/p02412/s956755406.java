import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int n;	//使う数字の範囲
		 int x;	//合計の目的指数
		 int cnt;	//組み合わせの数
		 while(true){
			 n = Integer.parseInt(scan.next());
			 x = Integer.parseInt(scan.next());
			 cnt = 0;
			 if(x == 0 && n == 0){
				 break;
			 }else{
				 for(int i = 1; i <= n; i++ ){
					 for(int l = i + 1; l <= n; l++ ){
						 for(int k = l + 1; k <= n; k++ ){
							 if((i + l + k) == x){
								 cnt++;
							 }
						 }
					 }
				 }
		 }//while 
			 System.out.println(cnt);
		 }
	}
}