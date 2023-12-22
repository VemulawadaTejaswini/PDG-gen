import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int baka=sc.nextInt();
		int[] kazu = new int[baka];
		//これが繰り返し判断するためのやつ
		int count=0;
		int get=0;
		int x,p;
		for(int i=0;i<baka;i++) {
			get=sc.nextInt();
			if(get==0) {
				x=sc.nextInt();
				kazu[count]=x;
				count++;
			}
			if(get==1) {
				p=sc.nextInt();
				System.out.println(kazu[p]);
			}
			if(get==2) {
				count--;
			}
		}
	}
}

