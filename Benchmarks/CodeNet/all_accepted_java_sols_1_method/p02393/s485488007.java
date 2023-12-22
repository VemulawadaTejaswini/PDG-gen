import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int num[] = new int[3];
		if(a < b) {
			num[0] = a;
			num[1] = b;
			if(c < a) {
				num[0] = c;
				num[1] = a;
				num[2] = b;
			}
			else if(c < b) {
				num[1] = c;
				num[2] = b;
			}
			else num[2] = c;
		}
		else {
			num[0] = b;
			num[1] = a;
			if(c < b) {
				num[0] = c;
				num[1] = b;
				num[2] = a;
			}
			else if(c < a) {
				num[1] = c;
				num[2] = a;
			}
			else num[2] = c;
		}
		System.out.printf("%d %d %d\n",num[0],num[1],num[2]);
		sc.close();
	}
}
