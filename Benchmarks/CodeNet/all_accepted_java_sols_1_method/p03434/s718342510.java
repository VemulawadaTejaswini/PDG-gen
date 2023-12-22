import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		int alice=0,bob=0,flag=0;
		for(int i=N-1;i>=0;i--) {
			if(flag==0) {
				alice+=array[i];
				flag=1;
			}else {
				bob+=array[i];
				flag=0;
			}
		}
		System.out.println(alice-bob);
	}
}
