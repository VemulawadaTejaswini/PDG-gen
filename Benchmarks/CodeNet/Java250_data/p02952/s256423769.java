import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String n[] = new String[N] ;
		int count = 0;

		for(int i = 0; i < N; i++) {
			n[i] = String.valueOf(i+1);
		}
		
		for(int i = 0; i < N; i++) {
			if(n[i].length()==1) {
				count++;
			}
			if(n[i].length()==3) {
				count++;
			}
			if(n[i].length()==5) {
				count++;
			}
		}
		
		System.out.print(count);
	}
}