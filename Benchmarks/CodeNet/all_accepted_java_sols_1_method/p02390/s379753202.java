class Main{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner( System.in );
		int t = sc.nextInt();
		int h = t/3600;
		int m = (t%3600)/60;
		int s = (t%3600)%60;
		System.out.println( h + ":" + m + ":" + s );
	}
}