import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int count;

		while(true){
			count = 0;
			n = sc.nextInt();
			if(n == 0){
				break;
			}
			for(int i=0;i<n/4;i++){
				count += sc.nextInt();
			}

			System.out.println(count);
		}
	}

}