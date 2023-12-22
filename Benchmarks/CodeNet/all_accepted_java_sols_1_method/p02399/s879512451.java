import java.util.Scanner;

public class Main {
	public static void main(String[] age){
		Scanner G = new Scanner(System.in);
		String imput = G.nextLine();
		String[] imputarray = imput.split(" ");
		StringBuilder sb = new StringBuilder();
		double a = Integer.parseInt(imputarray[0]);
		double b = Integer.parseInt(imputarray[1]);
		double c = a/b;
		double d = a%b;
		int f = (int)c;
		int g = (int)d;
		double e = a/b;
		String reale = String.format("%.5f", e);
		sb.append(Integer.toString(f)).append(" ").append(Integer.toString(g)).append(" ").append(reale);
		System.out.println(sb);
	}
}