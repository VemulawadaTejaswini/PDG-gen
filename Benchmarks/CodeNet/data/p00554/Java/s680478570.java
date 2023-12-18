import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int pointCard = 2 * N;
		int M = sc.nextInt();

		int[][] cards = new int[M][2];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < 2; j++) {
				cards[i][j] = sc.nextInt();
			}
		}

		int count = 0;
		int money = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < M; i++) {
			if (cards[i][0] >= cards[i][1]) {
				count++;
			} else {
				list.add(cards[i][1] - cards[i][0]);
			}
		}
      Collections.sort(list);
      int index=0;
     while(count<M-1) {
    	 int check=0;
    	 if(list.get(index)%2==0) {
    		 check=list.get(index)/2;
    	 }
    	 else {
    		 check=list.get(index)/2+1;
    	 }
    	 money+=check;
    	 count++;
    	 index++;
     }
     System.out.println(money);




	}
}

