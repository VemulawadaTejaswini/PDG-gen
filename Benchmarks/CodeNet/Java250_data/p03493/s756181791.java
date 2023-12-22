import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int ans=0;
		while(v>0) {
			if(v%10==1)++ans;
			v/=10;
		}
		System.out.println(ans);
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
