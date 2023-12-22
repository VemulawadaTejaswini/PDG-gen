import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int tp=0;
		int hp=0;

		for(int i=0; i<n;i++) {
			String[] array = new String[2];
			String taro=sc.next();
			String hanako=sc.next();
			array[0]=taro;
			array[1]=hanako;

			Arrays.sort(array);
			if(array[0].equals(array[1])) {
				tp+=1;
				hp+=1;
			}else if(array[1].equals(taro)) {
				tp+=3;
			}else if(array[1].equals(hanako)) {
				hp+=3;
			}
		}
		System.out.printf("%d %d", tp,hp);
		System.out.println();
	}
}
