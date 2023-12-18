import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String answer = "ZZZZZZZZ";
		String line = null;
		for(int i = 0;i < n;i++){
			line = sc.next();
			System.out.println(line);
			if(answer.compareToIgnoreCase(line)>=0){
				answer = line;
			}
		}
		System.out.println(answer);
	}

}