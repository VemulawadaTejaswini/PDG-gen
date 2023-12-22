import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		int maxHeight = sc.nextInt();
		int count = 1;
		for(int i=1;i<num;i++) {
			int me = sc.nextInt();
			if(maxHeight <= me) {
				count++;
				maxHeight = me;
			}
		}
		System.out.println(count);
	}
}