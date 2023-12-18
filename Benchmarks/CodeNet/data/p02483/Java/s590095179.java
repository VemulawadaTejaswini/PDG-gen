mport java.util.Scanner;
 class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x;
		if(a>=b){
			x=a;
			b=a;
			b=x;
		}
		if(b>=c){
			x=b;
			b=c;
			c=x;
			
		}
		if(a>=b){
			x=a;
			b=a;
			b=x;
		}
		System.out.println(a+" "+b+" "+c);
	}
}