public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];


			for(int i = 0; i < n;i++){
				x[i] = scan.nextInt();
			}
			for(int i = 0;i < n;i++){
				y[i] = scan.nextInt();
			}

			double p1 = 0;
			double p2 = 0;
			double p3 = 0;
			double p4 = 0;
			for(int i = 0;i < n;i++){
				p1 += Math.abs(x[i] - y[i]);
				p2 += Math.pow(Math.abs(x[i]-y[i]),2);
				p3 += Math.pow(Math.abs(x[i]-y[i]),3);
				if(p4<Math.abs(x[i]-y[i])){
					p4 = Math.abs(x[i]-y[i]);
				}
			}

			System.out.println(p1);
			System.out.println(Math.sqrt(p2));
			System.out.println(Math.cbrt(p3));
			System.out.println(p4);

		}
	}

}