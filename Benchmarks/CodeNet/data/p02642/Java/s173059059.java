import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute15_1();
	}
	
	private static void execute15_1() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int [] a = new int[n];
			
			boolean[] cannt = new boolean[n];
			for(int i=0; i<n; i++) {
				a[i] = sc.nextInt();
				cannt[i] = false;
			}
			
			int ans =n;
			Arrays.sort(a);
			boolean difF = false;
			for(int i=1; i<n; i++) {
				if(a[0]!=a[i]) difF=true;
				for(int j=i-1; j>=0; j--) {
					if(a[i]%a[j]==0) {
						ans--;
						break;
					}
				}
			}
			if(!difF) ans--;
			System.out.println(ans);
		}

	}
}