import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		char[]color = stdIn.next().toCharArray();
		int cnt = 1;
		for(int i = 0; i < n-1; i++) {
			if(color[i]!= color[i+1]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		
		
		
		
		
		
		
		
	}

}
