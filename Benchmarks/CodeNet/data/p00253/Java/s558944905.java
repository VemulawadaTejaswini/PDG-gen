import java.util.Arrays;
import java.util.Scanner;

//Kitchen Garden
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			int[] a = new int[n+1];
			int high = 0;
			for(int i=0;i<=n;i++){
				a[i]=sc.nextInt();
				if(0<i&&a[i]<=a[i-1])high=a[i-1];
			}
			if(0<high){
				System.out.println(high); continue;
			}
			int d1 = a[1]-a[0], d2 = a[3]-a[2];
			if(d1==d2){
				for(int i=4;i<=n;i++)if(a[i]-a[i-1]!=d1){
					System.out.println(a[i]); break;
				}
			}
			else System.out.println(a[2]-a[1]==d1?a[3]:a[2]-a[1]==d2?a[0]:a[2]-a[0]==d2?a[1]:a[2]);
		}
	}

	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}