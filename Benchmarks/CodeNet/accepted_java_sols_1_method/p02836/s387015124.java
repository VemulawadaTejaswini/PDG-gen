import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String[] input = sc.next().split("");
		int hug = 0;
		for(int i = 0; i < (input.length/2);i++) {
			if(!input[i].equals(input[input.length-1 -i])) {
				hug++;
			}
		}
		System.out.println(String.valueOf(hug));

	}

}