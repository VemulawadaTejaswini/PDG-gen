import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long cp=n;
		//
		StringBuilder A=new StringBuilder("");
		int count=0;
		//long p=n%27;
		
		
		
		if(n>26) {
			while(cp!=0) {
				cp/=26;
				count++;
			}
			long p[]=new long[count];
			int i=count-1;
			long a=n/26;
			while(a!=0) {
				a=n/26;
				long b=n%26;
				p[i]=b;
				a=n/26;
				n/=26;
				i--;
			}
			if(p[count-1]==0) {
				for(int j=count-1;j>=0;j--) {
					if(p[j]==0) {
						p[j]=25;
					}else {
						p[j]-=1;
						break;
					}
				}
			}else {
				p[count-1]-=1;
			}
			for(int j=0;j<count;j++) {
					//System.out.print(j);
					if(j!=count-1) {
						A.append((char)('a'+p[j]-1));
					}else {
						A.append((char)('a'+p[j]));
					}
					
			}
			
			
			
			
			//System.out.println(Arrays.toString(p));
		}else {
			A.append((char)('a'+n-1));
		}

		System.out.println(A);
		
		
	}
}
