import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		String judge = "APPROVED";
		for(int i = 0; i < N; i++){
			num[i] = sc.nextInt();
			if(num[i] % 2 == 0){
				if((num[i] % 3 != 0) && (num[i] % 5 != 0)){
					judge = "DENIED";
				}
			}
		}
		System.out.println(judge);
	}
}