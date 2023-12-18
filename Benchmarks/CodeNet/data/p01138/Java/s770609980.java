import java.util.Scanner;

public class Main{
	
	static int time(String s) {
		String[] t=s.split(":");
		return Integer.parseInt(t[0])*3600+Integer.parseInt(t[1])*60+Integer.parseInt(t[2]);
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				int[] start=new int[86401];
				int[] end=new int[86401];
				for(int i=0; i<n; i++) {
					int s=time(sc.next());
					int e=time(sc.next());
					start[s]+=1;
					end[e]+=-1;
				}
				int count=0, max=0;
				for(int i=0; i<=86400; i++) {
					count+=start[i]+end[i];
					max=Math.max(count, max);
				}
				System.out.println(max);
			}
			
		}
	}
}
