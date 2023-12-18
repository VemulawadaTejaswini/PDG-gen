import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		long[] score = new long[n];
		long[] tmp  = new long[n];
		for(int i = 0; i < n; i++) {
			score[i] = sc.nextLong();
			tmp[i] = score[i];
		}
		Arrays.sort(tmp);
		ArrayList<Long> leaders = new ArrayList<Long>();  
		for(int i = 0; i < q; i++) {
			String in = sc.next();
			int a = sc.nextInt()-1;
			if(in.equals("ADD")) {
				leaders.add(score[a]);
			}
			else if(in.equals("REMOVE")) {
				boolean rem = false;
				for(int j = 0; j < leaders.size(); j++) {
					if(!rem && leaders.get(j) == score[a]) {
						leaders.remove(j);
						break;
					}
				}
			}
			else {
				long L = 0;
				long R = 1 << 28;
				long C = (L + R) / 2;
				while(L != R) {
					C = (L + R)/2;
					int count = 0;
					boolean[] al = new boolean[n];
					for(int j = 0; j < leaders.size(); j++) {
						int idR = Arrays.binarySearch(tmp, leaders.get(j));
						while(idR+1 < tmp.length && tmp[idR+1] == tmp[idR]) idR++;
						for(int k = idR; k >= 0; k--) {
							if(tmp[k] < tmp[idR] - C) break;
							if(al[k]) continue;
							al[k] = true;
							count++;
						}
					}
					if(n - count <= a+1) {
						R = C;
					}
					else {
						L = C+1;
					}	
				}
				
				System.out.println((R == 1 << 28)?"NA":R);
			}
			
			
			
			
			
			
			
			
			
			
		}
	}
}