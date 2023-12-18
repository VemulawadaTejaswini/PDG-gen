import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	//0505
	static class Questionnaire {
		void placeRank() {
			for(;;) {
				int n = Integer.parseInt(sc.next());
				int m = Integer.parseInt(sc.next());
				if(n==0 && m==0) break;
				int[] places = new int[m];
				for(int i=0; i<n; i++) {
					for(int j=0; j<m; j++) {
						places[j] += Integer.parseInt(sc.next());
					}
				}

				for(int i=0; i<m; i++) {
					int maxInd=0;
					for(int j=0; j<m; j++) {
						if(places[maxInd] < places[j]) maxInd = j;
					}
					System.out.print((maxInd+1) + " ");
					places[maxInd] = -1;
				}
				System.out.println("");
			}
		}
	}

	public static void main(String[] args) {
		Questionnaire q = new Questionnaire();
		q.placeRank();
	}
}