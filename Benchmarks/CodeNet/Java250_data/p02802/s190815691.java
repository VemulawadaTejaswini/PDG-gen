import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		boolean[] x=new boolean[n+1];
		Arrays.fill(x,false);
		int[] y=new int[n+1];
		int sum=0,num=0;
		for(int i=0;i<m;i++) {
			int a=sc.nextInt();
			String s=sc.next();
			if(s.equals("AC")) {
				x[a]=true;
			}else {
				if(!x[a])
					y[a]++;
			}
		}
		for(int i=0;i<n+1;i++) {
			if(x[i])
				num+=y[i];
			if(x[i])
				sum++;
		}
		System.out.print(sum+" "+num);
	}
} 