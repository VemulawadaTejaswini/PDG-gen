import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;

		for(int i=0;i<n;i++) {
			sum += sc.nextInt();
		}
		System.out.print(h<=sum?"Yes":"No");

 }
}