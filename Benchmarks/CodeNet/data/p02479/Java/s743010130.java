class Main {
	public static void main(String[] args){

	java.util.Scanner scanner = new java.util.Scanner(System.in);
	int r = scanner.nextInt();
	float s = (float) (Math.PI*r*r);
	float l =(float) (2*r*Math.PI);
		System.out.println(s+" "+l);
		scanner.close();
	 }
}