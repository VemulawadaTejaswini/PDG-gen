import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int min=99999,sum=0;

		for(int i=1;i<=n;i++) {
			if(l+i-1<0) {
				min=-1*Math.min(Math.abs(l+i-1),Math.abs(min));
			}else {
				min=Math.min(Math.abs(l+i-1),Math.abs(min));
			}
			sum+=l+i-1;
		}
		System.out.println(sum-min);


	}
}
/*
 6
khabarovsk 20
moscow 10
kazan 50
kazan 35
moscow 60
khabarovsk 40
 */

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


