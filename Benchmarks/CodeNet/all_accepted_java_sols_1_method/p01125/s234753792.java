import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> result = new ArrayList<String>();
		Scanner insert = new Scanner(System.in);
		int n = -1;
		while(true) {
			String line = insert.nextLine();
			n = Integer.parseInt(line);
			if(n==0) {
				break;
			}
			int[] jewelX = new int[n];
			int[] jewelY = new int[n];
			int[] kekka = new int[n];
			for(int i =0; i < n; i++) {
				line = insert.nextLine();
				String array[] = line.split(" ");
				jewelX[i] = Integer.parseInt(array[0]);
				jewelY[i] = Integer.parseInt(array[1]);
			}
			line = insert.nextLine();
			int m = Integer.parseInt(line);
			int nowX = 10;
			int nowY = 10;
			for(int i =0;i < m; i++) {
				line = insert.nextLine();
				String array[] = line.split(" ");
				int distance = Integer.parseInt(array[1]);
				for(int j = 0; j < distance; j++) {
					if(array[0].equals("N")) {
						nowY++;
					}
					if(array[0].equals("E")) {
						nowX++;
					}
					if(array[0].equals("W")) {
						nowX--;
					}
					if(array[0].equals("S")) {
						nowY--;
					}
					for(int k = 0; k < n; k++) {
						if((nowX == jewelX[k]) && (nowY == jewelY[k])) {
							kekka[k] = 1;
						}
					}
				}
			}
			int sum = 0;
			for(int i = 0; i < n ; i++) {
				sum+=kekka[i];
			}
			if(sum == n) {
				result.add("Yes");
			}
			else {
				result.add("No");
			}

		}
		for(int i = 0;i < (result.size());i++) {
			System.out.println(result.get(i));
		}
	}
}

