import java.util.Scanner;
class Main {
    public void kami() {
                Scanner sc = new Scanner(System.in);
		int d,r;
		double f;
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		d = (int)(a / b);
		r = (int)(a % b);
		f = a / b;
		
		
		System.out.printf("%d %1d %.5f ",d , r , f);

    }
	public static void main(String[] args ) {
    new Main().kami();
	}

}