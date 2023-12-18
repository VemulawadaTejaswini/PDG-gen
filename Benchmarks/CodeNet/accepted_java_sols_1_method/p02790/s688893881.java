import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next()), b = Integer.parseInt(sc.next());
		if(a <= b){
			for(int i = 0; i < b; i++){
				System.out.print(a);
			}
		} else {
			for(int i = 0; i < a; i++){
				System.out.print(b);
			}
		}
		System.out.println();
	}
}
