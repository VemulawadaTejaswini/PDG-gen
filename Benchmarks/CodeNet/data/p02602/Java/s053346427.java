import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {

	public static void main(String[] args)throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(s1.nextToken()),k=Integer.parseInt(s1.nextToken());
		int a[]=new int[n];
		for(int i=0; i<n; i++) a[i]=Integer.parseInt(s.nextToken());
		List<Integer> l=new ArrayList<>();
		for(int i=0; i<=n-k; i++) {
			int sum=1;
			for(int j=i; j<i+k; j++) {
				sum*=a[j];
			}
			l.add(sum);
		}
		for(int i=1; i<l.size(); i++) {
			System.out.println(l.get(i)>l.get(i-1)?"Yes":"No");
		}
	}

}
