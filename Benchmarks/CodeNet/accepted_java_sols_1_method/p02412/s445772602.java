import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();
		ArrayList<Integer> x = new ArrayList<Integer>();
		for(int i = 0; ; i++) {
			int tmpn = sc.nextInt();
			int tmpx = sc.nextInt();
			int count = 0;
			if(tmpn == 0 && tmpx == 0)break;
			else {
				n.add(tmpn);
				x.add(tmpx);
			}
			for(int j = 1; j <= n.get(i)-2; j++) {
				for(int k = j+1; k <= n.get(i)-1; k++) {
					for(int l = k+1; l <= n.get(i); l++){
						if(j+k+l == x.get(i))count++;
					}
				}
			}
			System.out.println(count);
		}

	}

}

