import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			int sum = 0;
			String moji = scan.nextLine();
			if(scan.equals("0")){
				break;
			}

			for(char c: moji.toCharArray()){
				sum += Integer.parseInt("" + c);
			}

			System.out.println(sum);
		}
	}
}