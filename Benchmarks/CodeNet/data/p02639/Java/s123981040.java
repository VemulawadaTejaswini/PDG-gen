import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		for(int i=0;i<5;i++) {
			if(sc.nextInt() == 0) {
				n = i+1;
			}
		}
		System.out.println(n);
	}

}
