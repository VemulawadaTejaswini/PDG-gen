import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int n = in.nextInt();
			int[] search = new int[n-1];
			int count = 0;
			for(int i=0; i<n-1; i++) {
				search[i] = i+2;
			}
			for(int i=0; i<search.length; i++) {
				if (search[i] != -1) {
					count++;
					int tmp = search[i];
					for(int j=i; j<search.length; j+=(i+2)) {
//						System.out.println(search[j] + " " +  j);
							search[j] = -1;
					}
				}
			}
			System.out.println(count);
		}
	}
}