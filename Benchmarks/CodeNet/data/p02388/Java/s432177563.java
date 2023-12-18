class Main{

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		long x = in.nextLong();
		double y = Math.pow((double)x,3);
		long z = (long)y;
		System.out.println(z);
	}

}