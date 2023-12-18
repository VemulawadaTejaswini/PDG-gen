import java.util.Scanner;

class Main {
	public static void main(String a[]){
		double INTEREST = 0.05;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int debt = 100000;
		for(int i = 0; i<n;i++){
			debt *= (1+INTEREST);
			debt = normalization(debt);
		}
		System.out.println(debt);
		sc.close();
	}

	static int normalization(int num){
		if(num % 1000 != 0)
			num = num - num%1000 + 1000;
		return num;
	}

}

