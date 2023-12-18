import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] l = new int[n];
		
		for(int i = 0; i < n; i++) {
			l[i] = stdIn.nextInt();
		}
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int k = j + 1; k < n; k++) {
					if(l[i] != l[j] && l[j] != l[k]&& l[k] != l[i] && l[i] < l[j]+l[k] && l[j] < l[k]+l[i] && l[k] < l[i]+l[j] ) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
		
	}

}
