import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long sum = 1;
		for(int i = 1;i <= n;i++){
			sum *= (long)i;
		}
		System.out.println(sum);
	}
}