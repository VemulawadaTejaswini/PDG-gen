import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []ans = new int [26];
		
		for(int i = 0 ; i < n; i++) {
			
			int []alp = new int [26];
			
			char[]c = sc.next().toCharArray();
			
			for(int j = 0 ; j < c.length ; j++) {
				alp[c[j] - 'a']++;
			}
			
			for(int k = 0 ; k < 26 ; k++) {
				if(i == 0) {
					ans[k] = alp[k];
				}
				else {
					ans[k] = Math.min(ans[k], alp[k]);
				}
			}
		}
		for(int i = 0; i < 26 ; i++) {
			for(int j = 0 ; j < ans[i]; j++) {
				System.out.print((char) (i + 'a'));
			}
		}
		
		System.out.println("");
		

	}

}
