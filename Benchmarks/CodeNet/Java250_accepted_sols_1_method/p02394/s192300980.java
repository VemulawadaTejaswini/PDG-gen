import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();

		String answer;
		if(c - e < 0 || c + e > a){
			answer = "No";
		}else if(d - e < 0 || d + e >b){
			answer = "No";
		}else{
			answer = "Yes";
		}

		System.out.println(answer);
		scan.close();
	}
}