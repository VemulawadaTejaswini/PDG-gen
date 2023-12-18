class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int inte = scanner.nextInt();
		int big = scanner.nextInt();
		int middle = scanner.nextInt();
		int small = scanner.nextInt();
			
		System.out.println(inte/big+":"+(inte%big)/middle+":"+(inte%big)%middle);
		
	}

}