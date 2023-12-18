class Main {
	public static void main(String[] args){
		int c[];
		int i;
		int sum;
		
		c = new int [6];
		for (i = 0; i < 6; i++){
			c[i] = new java.util.Scanner (System.in).nextInt();
		}
		
		sum = c[5] * 500 + c[4] * 100 + c[3] * 50 + c[2] * 10 + c[1] * 5 + c[0] * 1;
		
		if (sum >= 1000){
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
}