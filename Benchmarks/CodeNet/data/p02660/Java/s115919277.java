import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n = sc.nextLong();
		int h=(int)Math.sqrt(n);
		int c=0;
		for(int i=2;i<=h;i++) {
			int count=0;
			while(n%(long)i==0) {
				n/=(long)i;
				count++;
			}
			int de=1;
			if(count!=0) {
				while(true) {
					count-=de;
					if(count<=0) break;
					de++;
				}
				c+=de;
			}
		}
		System.out.println(c);
	}
}