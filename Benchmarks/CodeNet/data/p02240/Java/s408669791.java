import java.util.Scanner;


public class Main {
	public static void main(String[] wjy) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] parent = new int[a];
		for (int i =0;i<a;i++) {
			parent[i] = i;
		}
		int b = sc.nextInt();
		for (int i=0;i<b;i++) {
			int j =sc.nextInt();
			int k =sc.nextInt();
			union(j,k,parent);
		}
		int c = sc.nextInt();
		for (int j =0;j<c;j++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if (find(m,parent)==find(n,parent)) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		sc.close();
	}
	//static int[] i
	public static int find(int x,int[] parent) {
		int c=x;
		while (parent[c] !=c) {
			c=parent[c];
		}
		return c;
		//if (parent[x]==x) {
		//	return x;
		//}
		//else {
		//	return find(parent[x],parent);
		//}
	}
	public static void union(int a,int b,int[] parent) {
		int r1 = find(a,parent);
		int r2 = find(b,parent);
		if (r1!=r2) {
			parent[r2]=r1;
		}
	}
}
