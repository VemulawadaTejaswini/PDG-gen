import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		while(scan.hasNext()) {
			num1=scan.nextInt();
			num2=scan.nextInt();
			if(num1==0 && num2==0) {
				break;
			}
			if(num1<num2) {
				System.out.printf("%d %d\r\n",num1, num2);
			}else {
				System.out.printf("%d %d\r\n",num2, num1);
			}

		}
		scan.close();

	}

}
