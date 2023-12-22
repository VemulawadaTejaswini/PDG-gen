import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt(); //aピザの値段
		int b = stdIn.nextInt(); //bピザの値段
		int ab = stdIn.nextInt(); //abピザの値段
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		
		int a_b = (ab*2); //aピザ1枚bピザ1枚 
		
		long sum = 0;
		
		//int min = Math.min(a_b, a+b); //abを買うかa,bそれぞれで買うか
		
		int t = 0;
		if(a_b > a+b) {
			t = 1;
		}else {
			t = 2;
		}
		
		
		if(t==2) {
				sum += Math.min(x, y)*a_b;
				if(x > y) {
					sum += (x-y)*a;
				}else {
					sum += (y-x)*b;
				}
			sum = Math.min(sum, a_b*(Math.max(x, y)));
	
		}else {
			sum += (x*a)+(y*b);
		}
		
		System.out.println(sum);
		
		
		
	}

}
