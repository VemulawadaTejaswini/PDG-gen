public class Main {
	public static void  main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		//int d;
		//d = a/b;
		System.out.println(a/b);

		//int r;
		//r = a%b;
		System.out.println(a%b);

		double f = (double)a/b;
		System.out.printf("%f\n",f);
	}

}