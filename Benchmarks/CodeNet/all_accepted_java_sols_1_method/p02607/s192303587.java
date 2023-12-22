import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N=sc.nextInt(),a=0;
		for(int i=0;i<N;i++) {
			int t=sc.nextInt();
			if(i%2==0&&t%2==1) {
				a++;
			}
		}
		System.out.println(a);
	}

}
