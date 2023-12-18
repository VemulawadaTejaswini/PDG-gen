import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] score = new int[n];
		int[] tmp   = new int[n];
		for(int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
			tmp[i] = score[i];
		}
		Arrays.sort(tmp);
		ArrayList<Integer> leaders = new ArrayList<Integer>();
		for(int i = 0; i < q; i++) {
			String in = sc.next();
			int a = sc.nextInt();
			if(in.equals("ADD")) {
				leaders.add(score[a-1]);
			}
			else if(in.equals("REMOVE")) {
				for(int j = 0; j < leaders.size(); j++) {
					if(leaders.get(j).intValue() == score[a-1]) {
						leaders.remove(j);
						break;
					}
				}
			}
			else {
				int L = 0;
				int U = 1000000001;
				Collections.sort(leaders);
				while(L != U) {
					int C = (L + U)/2;
					int prv = 0;
					int loss = 0;
					for(int j = 0; j < leaders.size(); j++) {
						int c = leaders.get(j).intValue() - C;
						if(c < 0) c = 0;
						int idR = Arrays.binarySearch(tmp, leaders.get(j).intValue());
						int idL = Arrays.binarySearch(tmp, c);
						while(idR+1 < tmp.length && tmp[idR+1] == tmp[idR]) idR++;
						if(idL < 0) idL = idL * -1 - 1;
						else {
							while(idL-1 > 0 && tmp[idL-1] == tmp[idL]) idL--;
						}
						loss += Math.max(idL - prv, 0);
						prv = idR+1;
						while(prv+1 < tmp.length && tmp[prv+1] == tmp[prv]) prv++;
					}
					loss += Math.max(n - prv, 0);
					if(loss <= a) {
						U = C;
					}
					else {
						L = C+1;
					}	
				}
				
				System.out.println((L == 1000000001)?"NA":L);
			}
		}
	}
}