public class Main {


		public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a;
		int b;
		int c;
		int i = 1;
		int t = 0;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if(a <= b && 1<=a && a <=10000 && 1<=b && b <=10000 && 1<=c && c<= 10000){
		for(i = a; i <= b ; i++){
			if(c % i == 0){
				
				t += 1;
			}
		}
		}System.out.println(t);
		
			




		}
}