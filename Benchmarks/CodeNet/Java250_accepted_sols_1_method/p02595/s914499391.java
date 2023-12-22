import java.util.Scanner;

/**
 * @author: Happy
 * @date:2020年8月2日 下午8:23:01
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int d=in.nextInt();
		int sum=0;
		for (int i = 0; i < n; i++) {
			long x=in.nextInt();
			long y=in.nextInt();
			double dis=Math.sqrt(x*x+y*y);
			if(dis<=d){
				sum++;
			}
		}
		System.out.println(sum);
	}

}