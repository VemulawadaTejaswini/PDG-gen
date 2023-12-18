import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		char[] rgb = scan.next().toCharArray();
		scan.close();
		
		long numR = 0;
		long numG = 0;
		long numB = 0;
		for(char c : rgb) {
			switch(c) {
			case 'R' : numR++; break;
			case 'G' : numG++; break;
			case 'B' : numB++; break;
			}
		}

		long ans = numR*numG*numB;

		for(int d=1;d<=n;d++){
			for(int m=0;m<n;m++){
				if(m-d<0||m+d>=n) continue;
          
				if(rgb[m-d] != rgb[m+d] && rgb[m] != rgb[m+d] && rgb[m-d] != rgb[m]) ans--;
			}
		}
		
		System.out.println(ans);
	}
}
