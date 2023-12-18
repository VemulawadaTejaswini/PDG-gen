import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int min=scan.nextInt();
		int max=-2000000000;
		for(int i=1;i<n;i++){
			int tmp=scan.nextInt();
			max=Math.max(max, tmp-min);
			min=Math.min(min, tmp);
		}
		System.out.println(max);
	}

}

