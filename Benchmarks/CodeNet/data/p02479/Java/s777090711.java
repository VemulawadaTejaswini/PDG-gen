import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int r = n.nextInt();
		double men = r*r*Math.PI;
		double shu = r*2*Math.PI;
		System.out.println(men+" "+shu);
	}
}