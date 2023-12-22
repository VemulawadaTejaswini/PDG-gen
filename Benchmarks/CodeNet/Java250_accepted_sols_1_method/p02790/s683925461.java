import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		String result = "";
		if(num1<num2) {
			for(int i = 0;i < num2;i++) {
				result += Integer.toString(num1);
			}
		}else if(num1 >= num2) {
			for(int i = 0;i < num1;i++) {
				result += Integer.toString(num2);
			}
		}
		System.out.println(result);
		scan.close();
	}
}