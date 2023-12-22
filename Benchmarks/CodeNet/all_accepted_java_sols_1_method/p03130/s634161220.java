import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int N = 4;
		boolean ad[][] = new boolean[N][N];
		for (int i = 0; i < 3; i++) {
			int a = sn.nextInt()-1;
			int b = sn.nextInt()-1;
			ad[a][b] = ad[b][a] = true;
		}
		boolean can = false;
		for (int i = 0; i < N; i++) 
			for (int j = 0; j < N; j++) 
				for (int k = 0; k < N; k++) 
					for (int p = 0; p < N; p++) 
						if( ad[i][j] && ad[j][k] && ad[k][p])
						{
							TreeSet<Integer> s = new TreeSet<Integer>();
							s.add(i);
							s.add(j);
							s.add(k);
							s.add(p);
							if( s.size() == 4 )
								can = true;
							
						}
		System.out.println(can?"YES":"NO");
		
		sn.close();
	}
}
