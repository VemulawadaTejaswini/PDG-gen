import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	int[] north = { 2, 6, 3, 4, 1, 5 };

	int[] east = { 4, 2, 1, 6, 5, 3 };

	int[] west = { 3, 2, 6, 1, 5, 4 };

	int[] south = { 5, 1, 3, 4, 6, 2 };

	int[] right = { 1, 3, 5, 2, 4, 6 };

	int[] left = { 1, 4, 2, 5, 3, 6 };



	int[] rotate(int[] before, int[] direction) {

		int[] after = new int[6];

		for (int i = 0; i < 6; i++) {

			after[i] = before[direction[i]];

		}

		return after;

	}



	void run() {

		HashMap<String, int[]> map = new HashMap<String, int[]>();

		map.put("North", north);

		map.put("West", west);

		map.put("South", south);

		map.put("East", east);

		map.put("Right", right);

		map.put("Left", left);

		for (int[] d : map.values()) {

			for (int i = 0; i < d.length; i++) {

				d[i]--;

			}

		}

		for(;;){

			int  n = sc.nextInt();

			if(n==0){

				break;

			}

			int[] dice = {1,2,3,4,5,6};

			int sum = 0;

			for(int i = 0; i < n;i++){

				dice = rotate(dice,map.get(sc.next()));

				sum += dice[0];

			}

			System.out.println(sum+1);

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}