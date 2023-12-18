public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// get a integer
		int D = sc.nextInt();
		// get two integers separated with half-width break
		int T = sc.nextInt();
		int S = sc.nextInt();
		System.out.print( T >= D/S ? "Yes": "No");
}
