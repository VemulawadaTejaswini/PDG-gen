import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.printf(" ");
		for(int i=1;i<=n;i++) {
                        int count=0;
			int x[]=new int[6];
			for(int j=0;j<5;j++) {
				int g=i;
				int data=0;
				x[j]=g%10;
				data=g/10;
				if(data==3||x[j]==3) {
					count++;
				}
                                if(data==0) {
					break;
				}
				g=data;
			}
			if(i%3==0||count!=0) {
				System.out.printf(i +"");
				if(i!=n) {
					System.out.printf(" ");
				}
			}
		}
		System.out.println("");
	}
}
