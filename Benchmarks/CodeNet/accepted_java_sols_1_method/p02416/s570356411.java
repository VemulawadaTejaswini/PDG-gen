import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

			while(true) {
			int sum = 0;
			String num = sc.next();
			if(num.equals("0"))	break;

			for(int i = 0; i < num.length(); i++) {
				int n = 0;
				n = Integer.parseInt(num.substring(i, i+1));
				sum += n;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}


