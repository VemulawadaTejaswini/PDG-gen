import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int d=in.nextInt(),l=in.nextInt();
		int cnt=0;
		while(d>0) {
			if(l>d)d--;
			else d-=l;
			cnt++;
		}
		System.out.println(cnt);
	}

}

