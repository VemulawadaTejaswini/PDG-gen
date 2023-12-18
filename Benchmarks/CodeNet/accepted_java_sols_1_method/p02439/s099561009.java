import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Max=0,Min=0;
		for(int i=0;i<3;i++) {
		int t = sc.nextInt();
		//int Max=0,Min=0;
			if(i==0) {
				Max = t;
				Min = t;
			}
			if(Max < t) Max = t;
			else if(Min > t) Min = t;
		}
		
		System.out.println(Min + " " + Max);
	}
}
