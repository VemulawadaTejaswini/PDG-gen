import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String moji=a+""+b;
		int res=Integer.parseInt(moji);

		for(int i=0; i<=320; i++) {
			if(res==i*i) {
				System.out.println("Yes");
				break;
			}
			else if(res<i*i) {
				System.out.println("No");
				break;
			}
		}
	}
}