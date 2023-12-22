public class Main {


		public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		double i, r, s;
		i = scan.nextDouble();

		if(0<i && i < Math.pow(10, 4)){
			
			r = i*i*Math.PI;
			System.out.print(String.format("%.6f",r));
			System.out.print(" ");
			s = i*2*Math.PI;
			System.out.println(String.format("%.6f",s));

		}


		}
}