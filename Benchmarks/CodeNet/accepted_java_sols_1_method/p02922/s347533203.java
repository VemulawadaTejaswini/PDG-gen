import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(b==1) {
			System.out.println(0);
		}
		else {
			int ctr = a,i=a,count=1;
			while(ctr<b) {
				ctr+=a-1;
				count++;
			}
			System.out.println(count);
		}
		
	}
}
