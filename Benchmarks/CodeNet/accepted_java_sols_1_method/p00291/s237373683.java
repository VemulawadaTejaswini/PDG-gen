import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int a[]=new int [6];
		for(int i=0;i<6;i++){
			a[i]=scan.nextInt();
		}
		if(1000<=a[0]+a[1]*5+a[2]*10+a[3]*50+a[4]*100+a[5]*500){
			System.out.println(1);
		}
		else
			System.out.println(0);
	}
}