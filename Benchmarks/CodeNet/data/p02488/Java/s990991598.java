import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String first = sc.next();
		for(int i = 0; i < n-1; i++){ //捜査すべき文字列数はあとn-1
			String st = sc.next();
			if(first.compareTo(st) > 0){
				first = st;
			}
		}
		System.out.println(first);
	}
}