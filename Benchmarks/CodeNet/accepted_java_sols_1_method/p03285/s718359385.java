import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean key = false;
		a : while(true) {
			for (int i = 0;; i++) {
				for (int j = 0;; j++) {
					if ((4 * i + 7 * j) == N) {
						key = true;
						break a;
					} else if (N < j) break;
				}
				if(N < i)break a;
			}
		}
		System.out.println(key?"Yes":"No");
	}	
}