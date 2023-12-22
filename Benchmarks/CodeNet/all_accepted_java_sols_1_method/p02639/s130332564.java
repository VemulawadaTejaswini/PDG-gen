import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] x = new int[5];
		
		for(int i=0;i<5;i++) {
			x[i] = scan.nextInt();
		}
		
		for(int j=0;j<5;j++) {
			if(x[j] == 0) {
				System.out.println(j+1);
			}
		}

	}

}
