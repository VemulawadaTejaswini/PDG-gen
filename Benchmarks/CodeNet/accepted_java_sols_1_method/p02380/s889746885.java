import java.util.Scanner;

class Main {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	         
	        double x = c * Math.PI /180;
	         
	        double y = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(x));
	        double z = b * Math.sin(x);
	        double w = b * Math.sin(x) * a /2;
	         
	        System.out.println(w);
	        System.out.println(y + a + b);
	        System.out.println(z);
    	}
}