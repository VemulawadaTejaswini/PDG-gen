import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final int x=sc.nextInt();
		int xmin=x;
		int xmax=x;
		int n=sc.nextInt();
		int p[]=new int[n];
		for (int i = 0; i <n; i++) {
			p[i]=sc.nextInt();
		}
		boolean flag=true;
		while (flag) {
			flag=false;
			for (int i = 0; i <n; i++) {
				if(xmin==p[i]){flag=true;xmin--;break;}
			}
		}
		flag=true;
		while (flag) {
			flag=false;
			for (int i = 0; i <n; i++) {
				if(xmax==p[i]){flag=true;xmax++;break;}
			}
		}
		if(Math.abs(xmin-x)<=Math.abs(xmax-x)){System.out.println(""+xmin);}
		else if(Math.abs(xmin-x)>=Math.abs(xmax-x)){System.out.println(""+xmax);}
}
}