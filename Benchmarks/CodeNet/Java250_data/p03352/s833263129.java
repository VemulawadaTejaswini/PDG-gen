import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		int ans = 1;
		for (int i=1; i<1000; i++){
			for(int p=2; p<1000; p++){
				if (Math.pow(i, p) <= X && ans < Math.pow(i, p)){
					ans = (int)Math.pow(i, p);
				}
			}
		}
		System.out.println(ans);
	}
}