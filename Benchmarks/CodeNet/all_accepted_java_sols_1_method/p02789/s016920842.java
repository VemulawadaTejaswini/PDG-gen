import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String result;
		result = (N==M) ? "Yes" : "No";
		System.out.println(result);
	}
}
