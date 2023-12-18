import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		for(int i = b; i <= c; i++){
			if(i % a == 0){
				System.out.print("OK");
				return;
			}
		}
		System.out.print("NG");
	}
}