import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		
		double x = 0, y = 0;
		int a, dt;
		int t = 0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			Scanner str = new Scanner(sc.nextLine());
			str.useDelimiter(",");
			
			a = str.nextInt();
			dt = str.nextInt();
			if(a == dt && a == 0) break;
			
			x += a * Math.sin((double) t/ 360 * 2 * Math.PI);
			y += a * Math.cos((double) t/ 360 * 2 * Math.PI);	
			t += dt;
			str.close();
			
		}
		sc.close();
		
		System.out.println((int)x);
		System.out.println((int)y);
	}
	
}