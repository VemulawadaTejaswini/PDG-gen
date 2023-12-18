import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 char[] O = sc.next().toCharArray();
		 char[] E = sc.next().toCharArray();

		StringBuilder sb = new StringBuilder();
		int ocnt = 0;
		int ecnt = 0;
		for(int i = 0;i < O.length+E.length;i++){
			if(i%2==0) {
				sb.append(O[ocnt]);
				ocnt++;
			}else {
				sb.append(E[ecnt]);
				ecnt++;
			}
		}
		System.out.println(sb.toString());
	}
}