import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] o = scan.next().split("");
		String[] e = scan.next().split("");
		String result = "";
		int len = e.length;

		for(int i=0; i<len; i++ ) {
			result += o[i]+e[i];
		}

		System.out.println( (o.length>e.length)? result+o[o.length-1] : result);
	}

}