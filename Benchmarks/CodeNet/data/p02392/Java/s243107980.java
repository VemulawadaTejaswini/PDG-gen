class Main{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner( System.in );
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if( a < b && b < c ) System.out.println( "Yes" );
		else System.out.println( "No" );
	}
}