import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int n=in.nextInt(),max=-1000000,min=1000000;long sum=0;
		for(int i=0;i<n;i++) {
			int a=in.nextInt();
			max=Math.max(max, a);
			min=Math.min(min, a);
			sum+=a;
		}
		out.printf("%d %d %d\n",min,max,sum);
		out.flush();
	}

}

