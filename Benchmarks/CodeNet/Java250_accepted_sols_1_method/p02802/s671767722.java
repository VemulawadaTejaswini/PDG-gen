import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		boolean[] ac=new boolean[n+1];
		int[] wa=new int[n+1];
		Arrays.fill(ac, false);
		int acn = 0,wan = 0;
		while(m-->0) {
			int a=sc.nextInt();
			String s=sc.nextLine();
			if(s.equals(" AC")) {
				ac[a] = true;
			}else {
				if(!ac[a]) {
					wa[a]++;
				}
			}
		}
		for(int i=1;i<n+1;i++) {
			if(ac[i])
				acn++;
			if(wa[i]>0&&ac[i]) {
				wan+=wa[i];
			}
		}
		System.out.print(acn+" "+wan);
	}
}