import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		char[] d = s.toCharArray();

		long cntR = 0;
		long cntG = 0;
		long cntB = 0;
		int i,j,k;
		for(i = 0; i < n; i++) {
			switch(d[i]){
			case 'R':
				cntR++;
				break;
			case 'G':
				cntG++;
				break;
			case 'B':
				cntB++;
				break;

			}
		}

		long ans = cntR * cntG * cntB;
		for(i = 0; i < n - 2; i++) {
			for(j = i + 1; j < n - 1; j++) {
				k = i + (j - i) * 2;
				if(k >= n)
					break;

				if(d[i] != d[j] && d[j] != d[k] && d[i] != d[k])
					ans--;
			}
		}
		System.out.println(ans);
	}
}
