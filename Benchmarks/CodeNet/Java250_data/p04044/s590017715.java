import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		String[] s = new String[N];
		for(int i=0; i<N; i++){
			s[i] = sc.next();
		}
		for(int i=0; i<N; i++){
			for(int j=N-1; j>i; j--){
				if(s[j].compareTo(s[j-1])<0){
					String exc = s[j];
					s[j] = s[j-1];
					s[j-1] = exc;
				}
			}
			System.out.print(s[i]);
		}
		System.out.println("");
	}
}