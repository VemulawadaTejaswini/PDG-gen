import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		boolean[] ly = new boolean[3000];
		for (int i = 0; i < ly.length; i++) {
			if ((i % 4) == 0) ly[i] = true;
			else ly[i] = false;
			if ((i % 100) == 0) ly[i] = false;
			if ((i % 400) == 0) ly[i] = true;
		}

		int index = 0;
		while (sc.hasNextLine() == true) {
			String[] nico = sc.nextLine().split(" ");
			int a = Integer.parseInt(nico[0]);
			int b = Integer.parseInt(nico[1]);
			
			if ((a == 0) && (b == 0)) break;
			
			if (index > 0) System.out.println();
			
			StringBuilder sb = new StringBuilder();
			for (int i = a; i < b; i++) {
				if (i <= 0) continue;
				if (i >= 3000) break;
				if (ly[i] == true) sb.append(i + "\n");
			}
			if (sb.toString().equals("")) sb.append("NA\n");
			System.out.print(sb);
			
			index++;
		}
	}
}