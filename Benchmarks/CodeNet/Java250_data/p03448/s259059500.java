import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int X=sc.nextInt();
		int a=0;
		for(int i=0;i<=C;i++) {
			for(int k=0;k<=B;k++) {
				for(int m=0;m<=A;m++) {
					if(i*50+k*100+m*500==X) {
						a=a+1;
					}
				}
			}
		}
		System.out.println(a);
	}
}