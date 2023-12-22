import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		char[]c = sc.next().toCharArray();
		
		int sum = 1;
		for(int i = 0; i < n-1 ; i++) {
			if(c[i] != c[i+1]) {
				sum++;
			}
		}
		System.out.println(sum);

	}

}
