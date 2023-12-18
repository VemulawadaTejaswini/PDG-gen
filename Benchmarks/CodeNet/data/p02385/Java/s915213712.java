import java.util.Random;
import java.util.Scanner;
public class Main {
	static Scanner scan=new Scanner(System.in);
	static Random rand=new Random();
		public static void main(String[] args) {
			int di[]=new int[6];
			for(int i=0;i<6;i++) di[i]=scan.nextInt();
			int di2[]=new int[6];
			for(int i=0;i<6;i++) di2[i]=scan.nextInt();
			for(int i=0;i<10000;i++) {
				int a=rand.nextInt(4);
				char ch=' ';
				switch(a) {
				case 0:ch='E';break;
				case 1:ch='W';break;
				case 2:ch='N';break;
				case 3:ch='S';break;
				}
				di2=dice(di2,ch);
				boolean b=true;
				for(int j=0;j<6;j++) {
					if(di[j]!=di2[j]) {b=false;}
				}
				if(b) {
					System.out.println("Yes");return;
				}
			}
			System.out.println("No");
		}
		public static int[] dice(int d[],char ch) {
			int d1=d[0];//上
			int d2=d[1];//前
			int d3=d[2];//右
			int d4=d[3];//左
			int d5=d[4];//奥
			int d6=d[5];//下
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
