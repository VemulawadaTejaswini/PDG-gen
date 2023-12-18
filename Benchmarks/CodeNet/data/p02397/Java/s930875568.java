import java.util.Scanner;

public class Main {
	public static void main(String[] age){
		Scanner imput = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(true){
			String x = imput.nextLine();
			String[] arrayimput = x.split(" ");
			int a = Integer.parseInt(arrayimput[0]);
			int b = Integer.parseInt(arrayimput[1]);
			int c;
			if(a == 0 & b == 0) break;
			if(a > b){
				c = a;
				a = b;
				b = c;
			}
			sb.append(Integer.toString(a)).append(" ").append(Integer.toString(b)).append("\n");
		}
		System.out.print(sb);
	}
}