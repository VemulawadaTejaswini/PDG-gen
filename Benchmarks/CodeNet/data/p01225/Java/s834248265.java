import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		IN:for(int i = 0; i < t; i++) {
			ArrayList<Integer> R = new ArrayList<Integer>();
			ArrayList<Integer> G = new ArrayList<Integer>();
			ArrayList<Integer> B = new ArrayList<Integer>();
			int[] list = new int[9];
			for(int j = 0; j < 9; j++) {
				list[j] = sc.nextInt();
			}
			for(int j = 0; j < 9; j++) {
				String in = sc.next();
				if(in.equals("R")) R.add(list[j]);
				if(in.equals("G")) G.add(list[j]);
				if(in.equals("B")) B.add(list[j]);
			}
			int count = 0;
			boolean A1 = true;
			Collections.sort(R);
			Collections.sort(G);
			Collections.sort(B);
			for(int j = 0; j < R.size(); j++) {
				for(int k = j; k < j + 2; k++) {
					if(k+1 >= R.size()) {
						A1 = false;
						break;
					}
					if(R.get(k) != R.get(k+1)) {
						A1 = false;
						break;
					}
				}
				if(A1) {
					R.remove(j);
					R.remove(j);
					R.remove(j);
					j -= 1;
					count++;
				}
			}
			A1 = true;
			for(int j = 0; j < G.size(); j++) {
				for(int k = j; k < j + 2; k++) {
					if(k+1 >= G.size()) {
						A1 = false;
						break;
					}
					if(G.get(k) != G.get(k+1)) {
						A1 = false;
						break;
					}
				}
				if(A1) {
					G.remove(j);
					G.remove(j);
					G.remove(j);
					j -= 1;
					count++;
				}
			}
			A1 = true;
			for(int j = 0; j < B.size(); j++) {
				for(int k = j; k < j + 2; k++) {
					if(k+1 >= B.size()) {
						A1 = false;
						break;
					}
					if(B.get(k) != B.get(k+1)) {
						A1 = false;
						break;
					}
				}
				if(A1) {
					B.remove(j);
					B.remove(j);
					B.remove(j);
					j -= 1;
					count++;
				}
			}
			
			A1 = true;
			for(int j = 0; j < R.size(); j++) {
				for(int k = j; k < j + 2; k++) {
					if(k+1 >= R.size()) {
						A1 = false;
						break;
					}
					if(R.get(k)+1 != R.get(k+1)) {
						A1 = false;
						break;
					}
				}
				if(A1) {
					R.remove(j);
					R.remove(j);
					R.remove(j);
					j -= 1;
					count++;
				}
			}
			A1 = true;
			for(int j = 0; j < G.size(); j++) {
				for(int k = j; k < j + 2; k++) {
					if(k+1 >= G.size()) {
						A1 = false;
						break;
					}
					if(G.get(k)+1 != G.get(k+1)) {
						A1 = false;
						break;
					}
				}
				if(A1) {
					G.remove(j);
					G.remove(j);
					G.remove(j);
					j -= 1;
					count++;
				}
			}
			A1 = true;
			for(int j = 0; j < B.size(); j++) {
				for(int k = j; k < j + 2; k++) {
					if(k+1 >= B.size()) {
						A1 = false;
						break;
					}
					if(B.get(k)+1 != B.get(k+1)) {
						A1 = false;
						break;
					}
				}
				if(A1) {
					B.remove(j);
					B.remove(j);
					B.remove(j);
					j -= 1;
					count++;
				}
			}
			
			if(count == 3) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
			
			
			
			
			
			
		}
	}
}