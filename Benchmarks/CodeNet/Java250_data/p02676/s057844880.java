import java.util.*;
public class Main{
	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		int K = ob.nextInt();
		String S = ob.next();
		String D = "...";
		String R = "";
		
		if(S.length() > K){
			for(int i = 0; i < K; i++){
				R += S.charAt(i);
			}
			R += "...";
			
			System.out.println(R);
		}
		else{
			System.out.println(S);
		}
	}
}