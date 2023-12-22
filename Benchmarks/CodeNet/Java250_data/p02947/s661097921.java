import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			String[]s = new String[N];
			char[][] o = new char[N][10];
			
			for(int i = 0;i<N;i++) {
				s[i] = scan.next();
				o[i] =s[i].toCharArray();
				Arrays.sort(o[i]);
				s[i] = new String(o[i]);
				
			}
			
			
			for(int i = 0;i<N;i++) {

				//System.out.println(s[i]);
			}
			
			Arrays.sort(s);
			
			for(int i = 0;i<N;i++) {

				//System.out.println(s[i]);
			}
			
			
			
			
			
			
			
			
			long count = 1;
			long goukeikumiawase = 0;
			
			for(int i=1;i<=N-1;i++) {
				/*if(i==N-1) {
					if(s[i].equals(s[i-1])) {
						count++;
					}else if(!s[i].equals(s[i-1])) {//同じじゃないなら
						if(count>=2) {//組み合わせが２つ以上ないとダメ
							goukeikumiawase+=combinations(count,2);
							count =1;
							}
					}
					
					if(count>=2) {
						goukeikumiawase+=combinations(count,2);
					}
				}else {*/
				
				if(s[i].equals(s[i-1])) {//同じなら
					count++;
					if(i==N-1) {
						goukeikumiawase+=combinations(count,2);
					}
				}else if(!s[i].equals(s[i-1])) {//同じじゃないなら
					if(count>=2) {//組み合わせが２つ以上ないとダメ
					goukeikumiawase+=combinations(count,2);
					count =1;
					}
				}
				}
				
				
				
				
				
			
			
			
			
			System.out.println(goukeikumiawase);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}
	
	
	
	private static long combinations(long n,long k){//(0<k&&k<n) 
		if(k==n){
			return 1;
		}else if(k==1) {
			return n;
		}
			return combinations(n-1, k-1)+combinations(n-1, k);
			
		}
	
	
	
	
		

}
