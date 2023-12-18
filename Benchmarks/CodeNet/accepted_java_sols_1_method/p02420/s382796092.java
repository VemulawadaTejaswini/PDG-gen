import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			for(;;) {
				String str = sc.next();
				if(str.contentEquals("-")) break;
				int length = sc.nextInt();

				for(int i=0;i<length;i++) {
					int num = sc.nextInt();
					str = str.substring(num) + str.substring(0,num);
				}
				System.out.println(str);
			}
		}
	}
}
