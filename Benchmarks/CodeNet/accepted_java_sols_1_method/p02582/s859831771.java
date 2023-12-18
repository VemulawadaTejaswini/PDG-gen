class Main{

	public static void main (String[] args) {

		Main main = new Main();

		java.util.Scanner sc = new java.util.Scanner(System.in);

		String weather = sc.next();

		int count = 0;
		int max = 0;

		for (int index=0; index<weather.length(); index++) {
			if (weather.charAt(index)=='R') {
				count++;
			} else {
				if (count>max) {
					max = count;
				}
				count=0;
			}
		}
		if (count>max) {
			max = count;
		}
		System.out.println(max);
		sc.close();
	}
}