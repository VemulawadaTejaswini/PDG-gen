import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");

		//コード
		//    	Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] L = new int[N];
		for (int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}
		int ans = 0;
		if(N<=2) {
			System.out.println(ans);
		} else {
			for (int i = 0; i < N - 2; i++) {
				for (int j = i + 1; j < N - 1; j++) {
					for (int k = j + 1; k < N; k++) {
						if(L[i]<(L[j]+L[k])&&L[j]<(L[k]+L[i])&&L[k]<(L[i]+L[j])&&(L[i]!=L[j]&&(L[j]!=L[k])&&(L[k]!=L[i]))) {
							ans++;
						}
					}
				}
			}
			System.out.println(ans);
		}

	}
}
