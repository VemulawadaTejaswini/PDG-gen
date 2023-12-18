import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] c = new int[101];
		int max = 0;
		while(sc.hasNext()) {
			int a = sc.nextInt();
			c[a]++;
			if(max < c[a]) {
				max = c[a];
			}
		}
		sc.close();
		for(int i = 1; i < 101; i++) {
			if(max == c[i]) {
				System.out.println(i);
			}
		}
	}
}

