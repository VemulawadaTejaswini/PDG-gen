import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[] kupc = new int[4];
		char[] s = stdIn.next().toCharArray();
		for(int i=0;i<s.length;i++){
			if(s[i]=='K'){
				kupc[0]++;
			}
			else if(s[i]=='U'){
				kupc[1]++;
			}
			else if(s[i]=='P'){
				kupc[2]++;
			}
			else if(s[i]=='C'){
				kupc[3]++;
			}
		}
		System.out.println(Math.min(kupc[0], Math.min(kupc[1], Math.min(kupc[2], kupc[3]))));
	}
}