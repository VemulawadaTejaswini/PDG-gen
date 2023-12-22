import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		char [] S = sc.next().toCharArray();
		//char s ='Z'; A→65
		for(int i=0;i<S.length;i++) {
			
			int t = (int)S[i] + N;
			while(t>90) {
				t = t - 26;
			}
			System.out.print((char)t);	
			
		}	
	}
}
	