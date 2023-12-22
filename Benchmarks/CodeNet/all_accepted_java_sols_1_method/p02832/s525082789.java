import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];

		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}

		int buff = 0;
		int count=0;

		for(int i=0;i<n;i++) {
			if(array[i] == buff+1) {
				buff = array[i];
			}else {
				count++;
			}
		}
		
		if(buff == 0) {
			System.out.println(-1);
		}else {
			System.out.println(count);
		}
		
	}
}


