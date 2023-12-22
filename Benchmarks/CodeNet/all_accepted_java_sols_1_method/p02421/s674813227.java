public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int cnt = sc.nextInt();
			int taro = 0;
			int hanako = 0;

			for (int i = 0; i < cnt; i++) {
				String strTaro = sc.next();
				String strHanako = sc.next();
				int compare = strTaro.compareTo(strHanako);

				if (compare > 0) {
					taro += 3;
				} else if (compare < 0) {
					hanako += 3;
				} else {
					taro++;
					hanako++;
				}
			}
			System.out.println(taro + " " + hanako);
		}
	}
}
