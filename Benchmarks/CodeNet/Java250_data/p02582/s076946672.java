import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] s  = sc.nextLine().toCharArray();
		int ans = 0;
		int rain = 0;
		
		for(char c : s) {
			if(c == 'R') {
				rain++;
				if(ans < rain) {
					ans = rain;
				}
			}else {
				rain = 0;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
	
}


