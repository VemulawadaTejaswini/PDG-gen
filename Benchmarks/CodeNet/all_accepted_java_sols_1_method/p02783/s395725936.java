import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int a=sc.nextInt();
		int cnt=0;
		
		for(int i=0;h>0;i++) {
			h-=a;
			cnt++;
		}
		System.out.println(cnt);
	}

}
