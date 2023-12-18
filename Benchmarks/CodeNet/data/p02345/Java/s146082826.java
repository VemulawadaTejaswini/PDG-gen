

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int op_num = 0;
		n = sc.nextInt();
		op_num = sc.nextInt();
		int[] arr = new int[n];
		String[] op = new String[op_num+1];
		for(int i= 0;i<op.length;i++)
			op[i] = sc.nextLine();
		
		
		//get data
		
		int[][] data = new int[op_num][2];
		int num=0;
		for(int i= 1, n1= 0; i<= op_num;i++,n1++) {
			if(data[n1][0] == 0) {
				String[] Split= op[i].split(" ");
				data[n1] = new int[Split.length];
				for(int j = 0;j<Split.length;j++)
					data[n1][j] = Integer.parseInt(Split[j]);
			}else {
				String[] Split = op[i].split(" ");
				data[n1] = new int[Split.length];
				for(int j = 0; j< Split.length;j++)
				{
					data[n1][j] = Integer.parseInt(Split[j]);	
				}
			}
		}
		
		for(int i=0;i<data.length;i++) {
			if(data[i][0]==0) {
				if(num <n )
					arr[num++] = data[i][2];
			}
		}
		
		
		
		//operate data
		MinSegmentTree seg = new MinSegmentTree(arr);
		
		for(int i= 0 ;i < data.length;i++ ) {
			if(data[i][0] == 0) {
					seg.update(data[i][1], data[i][2]);
			}
			else if(data[i][0] == 1){
					int result = seg.minimum(data[i][1], data[i][2]);
					System.out.println(result);
			}
		}
		
		
	
	
	}
}

class MinSegmentTree{
	public ArrayList<Integer> minSegmentTree;
	private int n;
	
	public  MinSegmentTree(int[] arr) {
		n = arr.length;
		minSegmentTree = new ArrayList<>(2*n);
		
		for(int i=0; i<n;i++) {
			minSegmentTree.add(0);
		}
		for(int i=0;i<n;i++) {
			minSegmentTree.add(arr[i]);
		}
		for(int i=n-1;i>0;i--) {
			minSegmentTree.set(i, Math.min(minSegmentTree.get(2*i), minSegmentTree.get(2*i +1)));
		}
	}
	
	public void update(int i,int value) {
		i+=n;
		minSegmentTree.set(i, value);
		while(i>1) {
			i /= 2;
			minSegmentTree.set(i, Math.min(minSegmentTree.get(2*i),minSegmentTree.get(2*i+1)));
		}
	}
	
	public int minimum(int left,int right) {
		left+=n;
		right+=n;
		int min = Integer.MAX_VALUE;
		
		while(left<right) {
			if((left&1) == 1) {
				min = Math.min(min,minSegmentTree.get(left) );
				left++;
			}
			if((right&1)==1) {
				right--;
				min = Math.min(min, minSegmentTree.get(right));
			}
			
			left >>= 1;
			right >>= 1;
		}
		return min;
	}
}

