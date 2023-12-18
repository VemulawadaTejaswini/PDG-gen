import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double w = sc.nextDouble();
			System.out.println(rank(w));
		}
		sc.close();
	}
	static String rank(double w) {
		if(w <= 48) return "light fly";
		if(w <= 51) return "fly";
		if(w <= 54) return "bantam";
		if(w <= 57) return "feather";
		if(w <= 60) return "light";
		if(w <= 64) return "light welter";
		if(w <= 69) return "welter";
		if(w <= 75) return "light middle";
		if(w <= 81) return "middle";
		if(w <= 91) return "light heavy";
		return "heavy";
	}
}
