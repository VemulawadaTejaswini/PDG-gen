import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n = sc.nextLong();
		int h=(int)Math.sqrt(n);
		if(n==1) {
			System.out.println(0);
			return;
		}
		int c=0,flag=0;
		for(int i=2;i<=h;i++) {
			int count=0;
			while(n%(long)i==0) {
				n/=(long)i;
				count++;
			}
			int de=1;
			if(count!=0) {
				flag=1;
				while(true) {
					count-=de;
					if(count<0) {
						de--;
						break;
					}
					if(count==0) break;
					de++;
				}
				c+=de;
			}
		}
		if(flag==0) System.out.println(1);
		else System.out.println(c);
	}
}