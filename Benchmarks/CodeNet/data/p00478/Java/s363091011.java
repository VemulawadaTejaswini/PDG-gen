import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String mes = stdIn.next();
		int n = stdIn.nextInt();
		int cnt = 0;
		for(int i=0;i<n;i++){
			StringBuffer input = new StringBuffer();
			input.append(stdIn.next());
			input.append(input);
			if(input.toString().contains(mes)){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}