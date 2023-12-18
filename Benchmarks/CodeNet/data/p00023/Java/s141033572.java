public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		int n = scan.nextInt();
		// while(n-->0){}
		for(int i = 0; i < n; i++){
			double xa = scan.nextDouble();
			double ya = scan.nextDouble();
			double ra = scan.nextDouble();
			double xb = scan.nextDouble();
			double yb = scan.nextDouble();
			double rb = scan.nextDouble();
			double l = Math.sqrt((xb- xa) * (xb - xa) + (yb- ya) * (yb - ya));
			if(l > ra + rb){
				System.out.printf("%d\n", 0);
			} else if(ra > l + rb){
				System.out.printf("%d\n", 2)
			} else if(rb > l + ra){
				System.out.printf("%d\n", - 2);
			} else{
				System.out.printf("%d\n", 1);
			}
		}
	}
}