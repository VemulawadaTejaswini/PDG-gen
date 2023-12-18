 class Test {
	static int calc1(int a,int b) {
		return a * b;
	}

	static int calc2(int a,int b) {
		return 2 * (a + b);
	}

	public static void main(String[] args) {


		int a = 1000;
		int b = 2000;

		System.out.print(calc1(a,b));
		System.out.print(" ");
		System.out.print(calc2(a,b));
	}

}

