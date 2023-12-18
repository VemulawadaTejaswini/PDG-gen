import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();//500
		int b=sc.nextInt();//100
		int c=sc.nextInt();//50
		int x=sc.nextInt()/50;//50~20000=1~400
		
		int ans=0;
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=b;j++) {
				for(int k=0;k<=c;k++) {
					if(x==i*10+j*2+k) {
						ans++;
					}
				}
			}
		}
		
		System.out.println(ans);

		}
	}
