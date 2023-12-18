import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		while (true){
			String str = input.next();
			if (str.equals("-")) break;
			
			int n = input.nextInt();
			
			while (n != 0){
				--n;
				int h = input.nextInt();
				str = str.concat(str.substring(0, h));
				str = str.substring(h);
			}
			
			System.out.println(str);
		}
	}
}