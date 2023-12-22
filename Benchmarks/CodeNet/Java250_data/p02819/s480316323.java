import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		int p = X;
		while(!prime(p)){
			p++;
		}
		System.out.println(p);
	}

	//素数判定(O(√n))
	private static boolean prime(int x){
		if(x<=1){
			return false;
		}
		for(int i = 2;i<=(int)Math.sqrt(x);i++){
			if(x%i==0){
				return false;
			}
		}
		return true;
	}
}