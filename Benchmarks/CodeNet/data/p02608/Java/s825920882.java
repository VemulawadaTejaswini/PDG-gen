import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N=sc.nextInt();
		for(int i=1;i<=N;i++) {
			int c=-1;
			int re=0;
			for(int x=1;x<100;x++) {
				for(int y=1;y<100;y++) {
					for(int z=1;z<100;z++) {
						c=x*x+y*y+z*z+x*y+y*z+z*x;
						if(c==i) re++;
					}
				}
			}
			System.out.println(re);
		}
	}
}