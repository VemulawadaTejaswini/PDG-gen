import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N,K;
		String S;
		Scanner sc=new Scanner(System.in);	
		S=sc.next();
		char c[]=S.toCharArray();
		int num=0;
		N=c.length;
		for(int i=0;i<N;i++) {
				
					if(i+1<=N-1) {
						if(c[i]=='0'&&c[i+1]=='0') {
						c[i+1]='1';
						num++;
						
						
					}else if(c[i]=='1'&&c[i+1]=='1'){
						c[i+1]='0';
						num++;
					}
					}
					
					
			}
			
		
			
		System.out.println(num);
	}
}
