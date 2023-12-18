import java.util.Scanner;
public class Main {
	static int count = 0;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		String[] s = sc2.nextLine().split("[\\s]+");
		double a = Double.parseDouble(s[0]);	
		double b = Double.parseDouble(s[1]);
		double theta =Double.parseDouble(s[2])*(Math.PI/180);
		double c = Math.sqrt(a*a+b*b-a*b*Math.cos(theta));
		double s1 = 0.5*a*b*Math.sin(theta);
		double h = (2*s1)/a;
		
		System.out.println(s1);
		System.out.println(a+b+c);
		System.out.println(h);
	}
}