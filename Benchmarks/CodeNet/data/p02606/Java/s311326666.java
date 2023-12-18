import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int L=sc.nextInt(),R=sc.nextInt(),d=sc.nextInt();
		int a=0;
		for(int i=L;i<=R;i++) {
			if(i%d==0) a++;
		}
		System.out.println(a);
	}

}
