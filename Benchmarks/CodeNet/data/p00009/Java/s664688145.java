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
					for(int j=n-2; j>=i; j--) {
						if(search[j] % search[i] == 0)
							search[j] = -1;
					}
				}
			}
			System.out.println(count);
		}
	}
}