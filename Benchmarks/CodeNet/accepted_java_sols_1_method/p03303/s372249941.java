import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int N = sc.nextInt();

		String ans = "";
		for(int n=0;n<(int)Math.ceil((float)st.length()/N);n++){

			ans += st.charAt(N*n);
		}
		System.out.println(ans);

	}
}