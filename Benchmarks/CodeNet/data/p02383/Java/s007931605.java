import java.util.Scanner;
public class Main {
	static Scanner scan=new Scanner(System.in);
		public static void main(String[] args) {
			int di[]=new int[6];
			for(int i=0;i<6;i++) di[i]=scan.nextInt();
			String str=scan.next();
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				di=dice(di,ch);
			}
			System.out.println(di[0]);
		}
		public static int[] dice(int d[],char ch) {
			int d1=d[0];
			int d2=d[1];
			int d3=d[2];
			int d4=d[3];
			int d5=d[4];
			int d6=d[5];
			int a[]=new int[6];
			switch(ch) {
			case'S':
				a[0]=d5;
				a[1]=d1;
				a[2]=d3;
				a[3]=d4;
				a[4]=d6;
				a[5]=d2;
				break;
			case'W':
				a[0]=d3;
				a[1]=d2;
				a[2]=d6;
				a[3]=d1;
				a[4]=d5;
				a[5]=d4;
				break;
			case'E':
				a[0]=d4;
				a[1]=d2;
				a[2]=d1;
				a[3]=d6;
				a[4]=d5;
				a[5]=d3;
				break;
			case'N':
				a[0]=d2;
				a[1]=d6;
				a[2]=d3;
				a[3]=d4;
				a[4]=d1;
				a[5]=d5;
				break;
			
			}
			return a;
		}
}
