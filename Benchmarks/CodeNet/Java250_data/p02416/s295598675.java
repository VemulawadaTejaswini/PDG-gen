import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		
		while(true){
			String number = scan.next();
			if(number.equals("0")) break;
			int sum = 0;
			for(int i = 0 ; i < number.length() ; i++){
				sum += Integer.parseInt("" + number.charAt(i));
			}
			str.append(sum + "\n");
		}
		
		System.out.print(str);
	}
}