import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		
		while(true) {
			int i1 = sc.nextInt();
			int i2 = sc.nextInt();
			
			if(i1 == 0 && i2 == 0) {
				break;
			}else {
				if(i1 < i2) {
					System.out.println(i1 + " " + i2);
				}else {
					System.out.println(i2 + " " + i1);
				}
			}
		}
	}
}

