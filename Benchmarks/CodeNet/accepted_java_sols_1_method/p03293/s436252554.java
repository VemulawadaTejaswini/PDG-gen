import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		String T = sc.next();

		int Len = S.length();

		for(int i = 0; i<Len; i++){
			String Ssub = S.substring(Len-1,Len) + S.substring(0, Len-1);

			S = Ssub;

			if(S.equals(T)){
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");
	}

}