import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int len = scan.nextInt();
		long[] array = new long[len];
		int count = 0;

		for(int i=0;i<len;i++) {
			array[i] = scan.nextLong();
		}

		for(long x:array) {
			while(true) {
			if(x%2 == 0) {
				x = x/2;
				count++;
			}else {
				break;
			}
			}
		}

		System.out.println(count);
		scan.close();

	}

}
