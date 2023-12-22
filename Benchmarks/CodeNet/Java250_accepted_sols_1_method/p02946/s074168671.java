import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int K= sc.nextInt();
		int X= sc.nextInt();
		int A=X-(K-1);
		int B=X+(K-1);	
		String ans=""+(A);

		for(int i=A+1;i<=B;i++){	
		ans=ans+" "+(i);			
		}	
		System.out.println(ans);	
	}
}