class Test{
	static int hour(int i) {
		return i / 3600;
	}

	static int minits(int i) {
		int a = i % 3600;
		return a / 60;
	}

	static int sec(int i) {
		int a = i % 3600;
		int b = a % 60;
		return b ;
	}

	public static void main(String[] args) throws Exception{
		int S = new java.util.Scanner(System.in).nextInt();

		System.out.println( hour(S) + ":" + minits(S) + ":" + sec(S));
	}

}
