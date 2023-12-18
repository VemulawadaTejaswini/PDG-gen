import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		int n = sc.nextInt();
		
		double ans = 0;
		for(int i = 0;i < n;i++){
			double num = sc.nextDouble();
			if(sc.next().equals("JPY")){
				ans += num;
			}else{
				ans  += num * 380000;

			}
			
		}
		System.out.println(ans);
		
	}
}

