import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[w];
		String[] st = new String[2];
		for(int i = 0; i < a.length; i++)
			a[i] = i + 1;
		
		for(int i = 0; i < n; i++){
			String str = sc.next();
			st = str.split(",",0);
			int x = Integer.parseInt(st[0])-1;
			int y = Integer.parseInt(st[1])-1;
			int t = a[x];
			a[x] = a[y];
			a[y] = t;
		}
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}