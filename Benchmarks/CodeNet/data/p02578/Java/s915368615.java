import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute20_2();
	}
	
	private static void execute20_2() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long[] a = new long[n];
			for(int i=0;i<n;i++) a[i] = sc.nextInt();
			
			long ans=0;
			long max=a[0];
			
			for(int j=1;j<n;j++) {
				if(max>a[j]) {
					ans+=max-a[j];
				} else {
					max=a[j];
				}
			}
			System.out.println(ans);
		}
	}
}