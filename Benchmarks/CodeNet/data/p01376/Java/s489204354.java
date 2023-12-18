
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i=in.nextInt(),j=in.nextInt(),max=0;
		for(int v=0;v<i;v++) {
			int cnt=0;
			for(int w=0;w<j;w++)cnt+=in.nextInt();
			max=Math.max(max,cnt);
		}
		System.out.println(max);
	}

}

