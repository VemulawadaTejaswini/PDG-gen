import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int X = scan.nextInt();
			
			int i = X;
			int minprime;
			
			while(true) {
				if(isprime(i)) {
					minprime =i;
					break;
				}
				i++;
			}
			
			System.out.println(minprime);
		}
	
		
	}
	
	
	
	private static boolean isprime(int x) {//素数判定、入力xが素数かtrue,falseで返す
		int i;
		if(x<2)return false;//まず２より小さいのは素数じゃない
		if(x==2)return true;//２は素数
		if(x%2==0)return false;//２で割り切れたら素数じゃない
		for(i =3;i*i<=x;i = i+2) {//それ以降iで割り切れたら素数じゃない
			if(x%i==0)
				return false;
		}
		return true;//for文回しても割り切れなかったらそれは素数
	}
		

}
