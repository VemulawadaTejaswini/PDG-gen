import java.util.*;

public class Main {
	
	public static String[] kommaReader(String sc) {
		String line = sc;
		String[] array = line.split(",");
		return array;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[w+1];
		for(int i=1; i<=w; i++) a[i]=i;
		for(int i=0; i<n; i++){
			String text = sc.next();
			String[] ch = kommaReader(text);
			int x = Integer.parseInt(ch[0]);
			int y = Integer.parseInt(ch[1]);
			int t = a[x]; 
			a[x] = a[y];
			a[y] = t;
		}
		for(int i=1; i<=w; i++) System.out.println(a[i]);
	}

}