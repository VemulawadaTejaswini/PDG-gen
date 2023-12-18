import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		long max=0;
		for(int i=1;i<=1000;i++) {
			for(int j=2;j<=1000;j++) {
				long tar=(long)Math.pow(i, j);
				if(tar<=x) {
					max=Math.max(max, tar);
				}
			}
		}
		
		System.out.println(max);
	}
}
