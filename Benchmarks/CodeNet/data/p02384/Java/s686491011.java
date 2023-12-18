import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	static Scanner scan=new Scanner(System.in);
		public static void main(String[] args) {
			int di[]=new int[6];
			for(int i=0;i<6;i++) di[i]=scan.nextInt();
			int a=scan.nextInt();
			List<Integer>list=new ArrayList<Integer>();
			for(int i=0;i<a;i++) {
				int b=scan.nextInt();
				int c=scan.nextInt();
				int basyo1=0,basyo2=0;
				for(int j=0;j<6;j++) {
					if(di[j]==b)basyo1=j;
					if(di[j]==c)basyo2=j;
				}
				switch(basyo1) {
				case 0:
					switch(basyo2) {
					case 1:list.add(di[2]);break;
					case 2:list.add(di[4]);break;
					case 3:list.add(di[1]);break;
					case 4:list.add(di[3]);break;
					}
					break;
				case 1:
					switch(basyo2) {
					case 0:list.add(di[3]);break;
					case 2:list.add(di[0]);break;
					case 3:list.add(di[5]);break;
					case 5:list.add(di[2]);break;
					}
					break;
				case 2:
					switch(basyo2) {
					case 0:list.add(di[1]);break;
					case 1:list.add(di[5]);break;
					case 4:list.add(di[0]);break;
					case 5:list.add(di[4]);break;
					}
					break;
				case 3:
					switch(basyo2) {
					case 0:list.add(di[4]);break;
					case 1:list.add(di[0]);break;
					case 4:list.add(di[5]);break;
					case 5:list.add(di[1]);break;
					}
					break;
				case 4:
					switch(basyo2) {
					case 0:list.add(di[2]);break;
					case 2:list.add(di[5]);break;
					case 3:list.add(di[0]);break;
					case 5:list.add(di[3]);break;
					}
					break;
				case 5:
					switch(basyo2) {
					case 1:list.add(di[3]);break;
					case 2:list.add(di[1]);break;
					case 3:list.add(di[4]);break;
					case 4:list.add(di[2]);break;
					}
					break;
				}
			}
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
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
