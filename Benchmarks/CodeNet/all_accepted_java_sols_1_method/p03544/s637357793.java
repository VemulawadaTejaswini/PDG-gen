import java.util.Scanner;
public class Main{

	static int []a;
	static int ans;
	static int count;
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);		//入s力
		int n = sc.nextInt();				//入力したのをint型に変換
		sc.close();
		long a0 = 2;
		long a1 = 1;
		long a2 = 0;
		if(n != 0){
			if(n != 1){
				for(int i = 0;i <= n-2;i++){
					a2 = a0 + a1;
					a0 = a1;
					a1 = a2;

				}
				System.out.println(a2);
			}else{
				System.out.println(a1);
			}
		}else{
			System.out.println(a0);
		}

	}



}
