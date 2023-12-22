import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int x=sc.nextInt();
		int tostart=0;
		int togoal=0;

		for(int i=0;i<m;i++) {
			int buf=sc.nextInt();
			if(buf<x) {
				tostart++;
			}else {
				togoal++;
			}
		}
		int ans=(tostart<togoal)?tostart:togoal;
		System.out.println(ans);
	}

}