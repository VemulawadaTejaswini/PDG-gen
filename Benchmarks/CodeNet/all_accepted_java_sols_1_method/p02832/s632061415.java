import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
 
		int N = scan.nextInt();
 
		int  a[] = new int[N];
		int count = 0;
 
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}
 
		int x = 1;
		for(int i = 0; i < N; i++) {
			// 左からi番目 == i
			// すぬけさんが満足
			if(a[i] == x) {
				x++;
			}else {
				count++;
			}
		}
 
		// 砕くの不可能
		if(count == a.length) {
			System.out.println(-1);
		}else {
			System.out.println(count);
		}
 
	}
}