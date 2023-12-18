package no0523;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			boolean[] taro = new boolean[n*2];
			for(int i=0;i<n;i++) {
				taro[sc.nextInt()-1] = true;
			}
			TreeSet<Integer>[] hand = new TreeSet[2];
			for(int i=0;i<2;i++) {
				hand[i] = new TreeSet<Integer>();
			}
			for(int i=0;i<n*2;i++) {
				hand[taro[i] ? 0 : 1].add(i+1);
			}
			int pool = 0;
			int turn = 0;
			while(true) {
				Integer next = hand[turn].ceiling(pool);
				if (next == null) {
					pool = 0;
				}else{
					hand[turn].remove(next);
					pool = next;
					if (hand[turn].size() == 0) {
						break;
					}
				}
				turn = 1 - turn;
			}
			System.out.println(hand[1].size());
			System.out.println(hand[0].size());
		}
	}

}