import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			String S = sc.next();
			String T = sc.next();

			char[] schar = S.toCharArray();
			char[] tchar = T.toCharArray();
			char[] rchar = new char[N*2];
			
			for(int i=0;i<N;i++) {
				rchar[2*i]= schar[i];
				rchar[2*i+1]=tchar[i];
			}
			
			
			System.out.println(rchar);
	}	

}