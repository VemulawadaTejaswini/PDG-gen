import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> result=new ArrayList<String>();
		
		while (true) {
			int n = sc.nextInt();
			if(n==0)break;
			int[][] card = new int[2][n];
			int p0 = 0;
			int p1 = 0;

			for (int i = 0; i < n; i++) {
				card[0][i] = sc.nextInt();
				card[1][i] = sc.nextInt();

				if (card[0][i] > card[1][i]) p0 += card[0][i] + card[1][i];
				else if (card[0][i] < card[1][i]) p1 += card[0][i] + card[1][i];
				else {
					p0 += card[0][i];
					p1 += card[1][i];
				}
			}
			result.add(p0+" "+p1);
		}
		
		for(String str:result)System.out.println(str);
		
	}
}