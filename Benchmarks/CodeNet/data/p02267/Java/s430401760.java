import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] c = new int[n];
		int key;
		int cnt=0;
		for (int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}
		int q=in.nextInt();

		for (int i = 0; i < q; i++) {
			key = in.nextInt();
			for (int j = 0; j < n; j++) {
				if(key==c[j]) {
					cnt+=1;
					break;
				}
			}
		}
		System.out.println(cnt);
		in.close();
	}



}

