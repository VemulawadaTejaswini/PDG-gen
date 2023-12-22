import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int firstmin = 0;
			int secondmin = 0;
			
			if(a<b & b<c){
				firstmin = a;
				secondmin = b;
			}else if(b<c & c<a){
				firstmin = b;
				secondmin = c;
			}else if(c<a & a<b){
				firstmin = c;
				secondmin = a;
			}else if(a<c & c<b){
				firstmin = a;
				secondmin = c;
			}else if(b<a & a<c){
				firstmin = b;
				secondmin = a;
			}else if(c<b & b<a){
				firstmin = c;
				secondmin = b;
			}else if(a==b & b==c){
				firstmin = a;
				secondmin = b;
			}else if(a==b & a<c){
				firstmin = a;
				secondmin = b;
			}else if(b==c & b<a){
				firstmin = b;
				secondmin = c;
			}else if(a==c & a<b){
				firstmin = a;
				secondmin = c;
			}else if(a==b & a>c){
				firstmin = c;
				secondmin = b;
			}else if(b==c & b>a){
				firstmin = a;
				secondmin = c;
			}else if(a==c & a>b){
				firstmin = b;
				secondmin = c;
			}
			
			int sum = firstmin + secondmin;
			// 出力
			System.out.println(sum);
		}
	}
}