import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<int[]> listcd = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int[] ab = new int[2];
			ab[0] = in.nextInt();
			ab[1] = in.nextInt();
			listcd.add(ab);
		}
		listcd.sort((ab1,ab2)->ab1[0]-ab2[0]);
		
		List<int[]> listab = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int[] cd = new int[2];
			cd[0] = in.nextInt();
			cd[1] = in.nextInt();
			listab.add(cd);
		}
		listab.sort((cd1,cd2)->cd1[0]-cd2[0]);
		
		boolean[] usedcd = new boolean[n];
		int count = 0;
		for(int i=0;i<n;i++) {
			int a = listab.get(i)[0];
			int b = listab.get(i)[1];
			
			int j = 0;
			int maxd = -1;
			int idx = -1;
			while(j<n) {
				int c = listcd.get(j)[0];
				int d = listcd.get(j)[1];
				if(c>=a) break;
				if(d>=b) {
					j++;
					continue;
				}
				if(!usedcd[j] && d>maxd) {
					maxd = d;
					idx = j;
				}
				j++;
			}
			if(idx>=0) {
				count++;
				usedcd[idx] = true;
			}
		}
		System.out.println(count);
		in.close();
	}

}
