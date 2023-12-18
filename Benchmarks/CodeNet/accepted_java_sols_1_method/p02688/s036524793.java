import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine().split(" ")[0]);
		boolean[] hasSnack = new boolean[N];
		
		while (sc.hasNextLine()) {
			sc.nextLine();
			for (String snk : sc.nextLine().split(" ")) {
              int snki = Integer.parseInt(snk) - 1;
              if (hasSnack[snki])
              	continue;
              N--;
			  hasSnack[snki] = true;
            }
		}
		
		System.out.println(N);
	
	}

}