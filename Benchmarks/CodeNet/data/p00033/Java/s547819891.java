public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] boll = new int[10];
		for(int k = 0; k < n; k++) {
			for(int i = 0; i < 10; i++) {
				boll[i] = scan.nextInt();
			}
			int judg = 0;
			for(int i = 0; i < n; i++) {
				int right,left;
				right = boll[0];
				left = 0;
				for(int m = 1; m < 10; m++) {
					if(right > boll[m]) {
						if(left < boll[m]) {
							left = boll[m];
						}
						else {
							judg = 0;
							break;
						}
					}
					else if(right < boll[m]) {
						right = boll[m];
					}
					judg = 1;
				}
				if(judg == 0) {
					System.out.println("NO");
				}
				else {
					System.out.println("YES");
				}
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}