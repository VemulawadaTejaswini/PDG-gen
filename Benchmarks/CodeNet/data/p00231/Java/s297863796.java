import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[] m = new int[n];
			int[] a = new int[n];
			int[] b = new int[n];
			PriorityQueue<Integer> que = new PriorityQueue<Integer>();
			que.add(0);
			for(int i=0;i<n;i++){
				m[i] = sc.nextInt();
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				if(que.contains(a[i])==false) que.add(a[i]);
				if(que.contains(b[i])==false) que.add(b[i]);
			}
			
			int s = que.size();
			int sum = 0;
			int p = 0;
			boolean flag = true;
			for(int i=0;i<s;i++){
				p = que.poll();
				sum = 0;
				for(int j=0;j<n;j++){
					if(a[j]<=p && p<b[j]) sum+=m[j];
				}
				if(sum>150){
					flag = false;
					break;
				}
			}
			if(flag==true) System.out.println("OK");
			else System.out.println("NG");
		}
	}	
}