import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve100();
	}

	public static void solve100(){
		Scanner sc = new Scanner(System.in);
		while(true) {
			int e = sc.nextInt();
			if(0==e) { break; }
			int m = 1000000;

			for(int z=0;z<=100;z++) {
				for(int y=0;y<1000;y++) {
					int x = e-z*z*z-y*y;
					if(m>(x+y+z)&&x>=0){
						m = x+y+z;
					}
					if(m<0) {
						break;
					}
				}
			}
			System.out.println(m);
		}
	}

}
