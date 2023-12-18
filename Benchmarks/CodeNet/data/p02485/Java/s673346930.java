import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String value;
		int total;
		String code = "0123456789";

		while (true){
			value = sc.next();
			total = 0;

			if (value.equals("0")){
				break;
			}

			for (int i = 0; i < value.length(); i++){
				char v = value.charAt(i);
				for (int j = 0; j < code.length(); j++){
					if (v == code.charAt(j)){
						total += j;
						break;
					}
				}
			}

			System.out.println("" + total);
		}
	}
}