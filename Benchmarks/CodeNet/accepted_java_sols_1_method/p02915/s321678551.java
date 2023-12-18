import java.util.*;

public class Main{
	public static void main(String args[]){

		// 値取得
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n == 0){
			System.out.println(n);
		}else{
			System.out.println(n*n*n);
		}
	}
}