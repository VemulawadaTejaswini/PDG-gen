public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String line = sc.nextLine();
			Scanner s = new Scanner(line);
			int n = s.nextInt();
			int m = 0;
			if (n < 37) { //37以上の場合はm=0は確かであるため
				for(int a=0; a<=9; a++) {
					for(int b=0; b<=9; b++) {
						for(int c=0; c<=9; c++) {
							for(int d=0; d<=9; d++) {
								if (a + b + c + d == n) m++;
							}
						}
					}
				}
			}
			System.out.println(m);
		}
	}
}