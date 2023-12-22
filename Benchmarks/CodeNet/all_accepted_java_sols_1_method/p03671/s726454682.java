import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<=b){
			if(b <= c){
				System.out.println(a+b);
			}else{
				System.out.println(a+c);
			}
		}else{
			if(a <= c){
				System.out.println(a+b);
			}else{
				System.out.println(b+c);
			}
		}
	}

}
