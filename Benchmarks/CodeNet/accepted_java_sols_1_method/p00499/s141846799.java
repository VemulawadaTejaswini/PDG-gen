import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();//日数
		int A = sc.nextInt();//国語のページ数
		int B = sc.nextInt();//算数のページ数
		int C = sc.nextInt();//国語の最大進行ページ
		int D = sc.nextInt();//算数の最大進行ページ
		int need1 = 0;
		int need2 = 0;
		if(A%C!=0){
			need1 += A/C+1;
		}else{
			need1 += A/C;
		}
		if(B%D!=0){
			need2 += B/D+1;
		}else{
			need2 += B/D;
		}
		if(need1>need2){
			System.out.println(L-need1);			
		}else{
			System.out.println(L-need2);
		}
	}
}