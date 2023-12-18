import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] List = new int[n];
		
		for(int a=0;a<n;a++)
			List[a] = sc.nextInt();
		
		int q = sc.nextInt();
		
		for(int i=0;i<q;i++) {
			
			int b = sc.nextInt();
			int m = sc.nextInt();
			int e = sc.nextInt();
			
			rotate(List,b,m,e);
		}
		
		for(int i=0;i<List.length;i++) {
			if(i==0) System.out.print(List[0]);
			else System.out.print(" " + List[i]);
		}
		
		System.out.println();
	}
	
	public static void rotate(int[] list ,int b,int m,int e) {
		int[] cloneList = list.clone();
		for(int k=0;k<e-b;k++) {
			list[b+((k+(e-m)) % (e-b))] = cloneList[b+k];
		}
	}
}
