import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		for(int i = 1; ; i++){
			int a = scan.nextInt();
			if(a == 0) break;
			System.out.printf("Case %d: %d\n", i, a);
		}
	}
}