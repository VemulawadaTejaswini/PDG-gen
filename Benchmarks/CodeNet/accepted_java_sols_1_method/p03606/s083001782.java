import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long result=0;
		long l[] =new long[N];
		long r[]= new long[N];
		for(int i=0;i<N;i++) {
			l[i]=sc.nextLong();
			r[i]=sc.nextLong();
			long max=Math.max(l[i], r[i]);
			long min=Math.min(l[i], r[i]);
			result+=(max-min+1);
		}
		System.out.println(result);
		
		
	}

	
}
		