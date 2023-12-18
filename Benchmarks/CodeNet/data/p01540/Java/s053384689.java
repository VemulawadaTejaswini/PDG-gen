
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * AOOJ id=2426
 * Treasure Hunt
 * @author scache
 *
 */
public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	int n;
	int m;
	int[] x;
	int[] y;
	Scanner sc;
	public Main() {
		sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		x = new int[n];
		y = new int[n];
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		solve();
	}

	public void solve() {
		int[] xc = new int[x.length+1];
		int[] yc = new int[y.length+1];
		xc[0] = Integer.MIN_VALUE;
		yc[0] = Integer.MIN_VALUE;
		System.arraycopy(x, 0, xc, 1, x.length);
		System.arraycopy(y, 0, yc, 1, y.length);
		xc = compress(xc);
		yc = compress(yc);
		for(int i=0;i<x.length;i++){
			x[i] = Arrays.binarySearch(xc, x[i]);
			y[i] = Arrays.binarySearch(yc, y[i]);
		}
		
		int[][] count = new int[yc.length][xc.length];
		for(int i=0;i<x.length;i++)
			count[y[i]][x[i]]++;
		
		for(int i=1;i<yc.length;i++)
			for(int j=1;j<xc.length;j++)
				count[i][j] += count[i][j-1];
		
		for(int i=1;i<xc.length;i++)
			for(int j=1;j<yc.length;j++)
				count[j][i] += count[j-1][i];
		
//		for(int i=0;i<count.length;i++)
//			System.out.println(Arrays.toString(count[i]));
		
		for(int i=0;i<m;i++){
			int[] c =new int[4];
			for(int j=0;j<4;j++){
				c[j] = Arrays.binarySearch(j%2==0 ? xc : yc, sc.nextInt());
				c[j] = c[j]>=0 ? c[j] : (c[j]+1)*(-1) - (j<2 ? 0 : 1);
			}
			c[0] = Math.max(0, c[0]-1);
			c[1] = Math.max(0, c[1]-1);
//			System.out.println(Arrays.toString(c));
			System.out.println(count[c[3]][c[2]] + count[c[1]][c[0]]
					-count[c[1]][c[2]] - count[c[3]][c[0]]);
			
		}
		
	}
	
	private int[] compress(int[] a){
		Set<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<a.length;i++){
			set.add(a[i]);
		}
		Iterator<Integer> iter = set.iterator();
		int[] ia = new int[set.size()];
		for(int i=0;i<ia.length;i++)
			ia[i] = iter.next();
		
		return ia;
		
	}
}