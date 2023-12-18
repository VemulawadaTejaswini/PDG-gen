import java.util.Scanner;

class dice {
	int[] num = new int[6];
	dice(int[] d) {
		num = d;
	}
	public void an(int x,int y) {
		if(x==num[0]&&y==num[1]||x==num[1]&&y==num[5]||x==num[5]&&y==num[4]||x==num[4]&&y==num[0]) {
			System.out.println(num[2]);
		}else if(x==num[0]&&y==num[2]||x==num[2]&&y==num[5]||x==num[5]&&y==num[3]||x==num[3]&&y==num[0]) {
			System.out.println(num[4]);
		}else if(x==num[0]&&y==num[4]||x==num[4]&&y==num[5]||x==num[5]&&y==num[1]||x==num[1]&&y==num[0]) {
			System.out.println(num[3]);
		}else if(x==num[0]&&y==num[3]||x==num[3]&&y==num[5]||x==num[5]&&y==num[2]||x==num[2]&&y==num[0]) {
			System.out.println(num[1]);
		}else if(x==num[4]&&y==num[3]||x==num[3]&&y==num[1]||x==num[1]&&y==num[2]||x==num[2]&&y==num[4]) {
			System.out.println(num[0]);
		}else {
			System.out.println(num[5]);
			}
		}
	}

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		int [] d=new int[6];
		for(int i=0;i<6;i++) {
			d[i]=sc.nextInt();
		}
		dice d1=new dice(d);
		int q=sc.nextInt();
		for(int i=0;i<q;i++) {
		a=sc.nextInt();
		b=sc.nextInt();
		d1.an(a,b);
		}
		sc.close();
	}
}


