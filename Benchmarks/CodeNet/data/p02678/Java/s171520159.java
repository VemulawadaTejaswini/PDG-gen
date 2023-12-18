import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[][] paths = new int[2*n][2*n];
			
			for(int i = 0 ; i < m ; i++ ) {
				int begin = sc.nextInt();
				int end = sc.nextInt();
				paths[begin][end] = 1;
				paths[end][begin] = 1;
			}
			int[] marks = new int[2*n];		
			Set<Integer> visited = new HashSet<>();
			Set<Integer> boundaries = new HashSet<>();
			
			visited.add(1);
			boundaries.add(1);
			int marked_count = 1; // room No.1
			
			while(marked_count < n) {
				Set<Integer> boundariesToRemove = new HashSet<>();
				Set<Integer> boundariesToAdd = new HashSet<>();
				for(int bound : boundaries) {
					for(int i = 2 ; i <= n ; i++ ) {
						if (paths[bound][i] == 1 && !visited.contains(i) ) {
							boundariesToAdd.add(i);
							visited.add(i);
							marked_count++;
							marks[i] = bound;
						}
					}
					boundariesToRemove.add(bound);
				}
				//check conditions --> we cannot find any paths
				if (boundariesToRemove.size() == 0  ) {
					System.out.println("No");
					return;
				}
				for(int r : boundariesToRemove) {
					if ( boundaries.contains(r)) 
						boundaries.remove(r);
				}
				for(int r : boundariesToAdd) {
					if ( !boundaries.contains(r) )
						boundaries.add(r);
				}
			}
			
			System.out.println("Yes");
			
			for(int i = 2 ; i <= n ; i++) {
				System.out.println(marks[i]);
			}
			
			
		}		
	}

}