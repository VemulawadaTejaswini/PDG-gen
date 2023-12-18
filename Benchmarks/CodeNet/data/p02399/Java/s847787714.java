public class Main {


		public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a;
		int b;
		double c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = (double)a/b;
		
		if(1<=a && a <=Math.pow(10, 9) && 1<=b && b <=Math.pow(10, 9)){
			System.out.print(a/b+" ");
			System.out.print(a%b+" ");
			System.out.println(String.format("%.5f", c));
			
		}
		
			




		}
}