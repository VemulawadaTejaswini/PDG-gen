import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = in.nextInt();
		int[][] d = new int[c][c];
		for(int i=0;i<c;i++) {
			for(int j=0;j<c;j++) {
				d[i][j] = in.nextInt();
			}
		}
		List<Integer> list0 = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i+j)%3==0) {
					list0.add(in.nextInt()-1);
				}else if((i+j)%3==1) {
					list1.add(in.nextInt()-1);
				}else {
					list2.add(in.nextInt()-1);
				}
			}
		}
		
		int[] cost0 = new int[3];
		cost0[0] = cost0[1] = cost0[2] = Integer.MAX_VALUE;
		int[] idx0 = new int[3];
		for(int i=0;i<c;i++) {
			int sum = 0;
			for(int idx=0;idx<list0.size();idx++) {
				sum += d[list0.get(idx)][i];
			}
			if(sum<cost0[0]) {
				cost0[2] = cost0[1];
				idx0[2] = idx0[1];
				cost0[1] = cost0[0];
				idx0[1] = idx0[0];
				cost0[0] = sum;
				idx0[0] = i;
			}else if(sum<cost0[1]) {
				cost0[2] = cost0[1];
				idx0[2] = idx0[1];
				cost0[1] = sum;
				idx0[1] = i;
			}else if(sum<cost0[2]) {
				cost0[2] = sum;
				idx0[2] = i;
			}
		}
		
		int[] cost1 = new int[3];
		cost1[0] = cost1[1] = cost1[2] = Integer.MAX_VALUE;
		int[] idx1 = new int[3];
		for(int i=0;i<c;i++) {
			int sum = 0;
			for(int idx=0;idx<list1.size();idx++) {
				sum += d[list1.get(idx)][i];
			}
			if(sum<cost1[0]) {
				cost1[2] = cost1[1];
				idx1[2] = idx1[1];
				cost1[1] = cost1[0];
				idx1[1] = idx1[0];
				cost1[0] = sum;
				idx1[0] = i;
			}else if(sum<cost1[1]) {
				cost1[2] = cost1[1];
				idx1[2] = idx1[1];
				cost1[1] = sum;
				idx1[1] = i;
			}else if(sum<cost1[2]) {
				cost1[2] = sum;
				idx1[2] = i;
			}
		}
		
		int[] cost2 = new int[3];
		cost2[0] = cost2[1] = cost2[2] = Integer.MAX_VALUE;
		int[] idx2 = new int[3];
		for(int i=0;i<c;i++) {
			int sum = 0;
			for(int idx=0;idx<list2.size();idx++) {
				sum += d[list2.get(idx)][i];
			}
			if(sum<cost2[0]) {
				cost2[2] = cost2[1];
				idx2[2] = idx2[1];
				cost2[1] = cost2[0];
				idx2[1] = idx2[0];
				cost2[0] = sum;
				idx2[0] = i;
			}else if(sum<cost2[1]) {
				cost2[2] = cost2[1];
				idx2[2] = idx2[1];
				cost2[1] = sum;
				idx2[1] = i;
			}else if(sum<cost2[2]) {
				cost2[2] = sum;
				idx2[2] = i;
			}
		}
		
		List<Integer> kouho = new ArrayList<>();
		
		for(int x=0;x<3;x++) {
			for(int y=0;y<3;y++) {
				for(int z=0;z<3;z++) {
					if(idx0[x]!=idx1[y] && idx1[y]!=idx2[z] && idx2[z]!=idx0[x]) {
						kouho.add(cost0[x]+cost1[y]+cost2[z]);
					}
				}
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i:kouho) {
			if(i<min) min=i;
		}
		System.out.println(min);

	}

}
