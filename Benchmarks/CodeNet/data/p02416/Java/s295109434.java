import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			String tmp = scan.nextLine();
			if(tmp.equals("0")){
				break;
			}
			int cnt = 0;
			int sum = 0;
			while(cnt < tmp.length())
				{
					String s = String.valueOf(tmp.charAt(cnt));
					sum += Integer.parseInt(s);
					cnt++;
				}
				System.out.println(sum);
		}
	}
}

