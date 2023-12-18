import java.util.ArrayList;
import java .util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int countmin = 0;
	int countbook = 0;
	int ncount = 0;
	int mcount = 0;
	int inputN = sc.nextInt();
	int inputM = sc.nextInt();
	int inputK = sc.nextInt();
	ArrayList<Integer> N = new ArrayList<Integer>();
	ArrayList<Integer> M = new ArrayList<Integer>();

	for(int i = 0; i < inputN; i++) {
		int n = sc.nextInt();
		N.add(n);
	}

	for(int i = 0; i < inputM; i++) {
		int m = sc.nextInt();
		M.add(m);
	}

	while(true) {
		if(N.size() >= ncount || M.size() >= mcount) {
			if(N.get(ncount) > M.get(mcount)) {
				if(countmin <= inputK) {
					countbook += 1;
					countmin += N.get(ncount);
					ncount += 1;
				}else {
					break;
				}
			}else if(N.get(ncount) <= M.get(mcount)){
				if(countmin <= inputK) {
					countbook += 1;
					countmin += M.get(mcount);
					mcount += 1;
				}else {
					break;
				}
			}else {
				break;
			}
		}else {
			break;
		}

	}
	System.out.println(countbook);
}
}