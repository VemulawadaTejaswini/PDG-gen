import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n,id;
		long p,q;
		long[] ID;
		boolean na = true;
		while((n = scn.nextInt()) != 0) {
			ID = new long[4001];
			na = true;
			for(int i = 0;i < n;i++) {
				id = scn.nextInt();
				p = scn.nextLong();
				q = scn.nextLong();
				ID[id] += p*q;
			}
			for(int i = 0;i < 4001;i++) {
				if(ID[i] >= 1000000) {
					System.out.println(i);
					na = false;
				}
			}
			if(na)System.out.println("NA");
		}
		scn.close();
	}
}
