import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),res=-1;
		
		for(int i=1;i<=1000;i++) {
			if((int)(i*0.08)==a && (int)(i*0.1)==b) {
				res=i;
				break;
			}
		}
		System.out.println(res);
	}
}
