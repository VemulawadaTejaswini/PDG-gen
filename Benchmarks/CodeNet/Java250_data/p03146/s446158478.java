import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[1000000];
		int s = sc.nextInt();
		sc.close();
		int i = 1;
		int previous = s;
		array[previous-1] = 1;
		while(true) {
			previous = getFN(previous);
			if(array[previous-1] != 1) {
				array[previous-1] = 1;
				i++;
			}else
				break;
		}
		System.out.println(i+1);
		
	}
	
	static int getFN(int n) {
		if(n%2 == 0) {
			return n/2;
		}else {
			return 3*n+1;
		}
	}
}