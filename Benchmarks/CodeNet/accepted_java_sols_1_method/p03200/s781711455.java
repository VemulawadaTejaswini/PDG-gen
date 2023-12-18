import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int ar[] = new int[S.length()];
		for(int s=0;s<S.length();s++){
			if(S.charAt(s) == 'B')
				ar[s] = 0;
			else {
				ar[s] = 1;
			}
		}
		long div = 0;
		long ans = 0;
		for(int s=0;s<S.length();s++){
			if(ar[s] == 0){
				div++;
			}else{
				ans += div;
			}

		}
		System.out.println(ans);

	}
}