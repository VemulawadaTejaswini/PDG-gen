import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*int Joken[] = new int[2];
		int joken = 0;
		while(joken < 2) {
			Joken[joken] = scan.nextInt();
		}*/
		String NL = scan.nextLine();
		String NandL[] = NL.split(" ");
		int L = Integer.parseInt(NandL[0]);
		int N = Integer.parseInt(NandL[1]);
		
		//System.out.println(N + " " + L);

		int line = 0;
		String out[] = new String[L];
		while(line < L) {
			String s = scan.nextLine();
			if(s.length() < N || s.length() > N)
				return;
			out[line] = s;
			line++;
		}

		Arrays.sort(out);

		int j = 0;
		while(j < out.length){
			System.out.print(out[j]);
			j++;
		}
		System.out.println("");

	}

}