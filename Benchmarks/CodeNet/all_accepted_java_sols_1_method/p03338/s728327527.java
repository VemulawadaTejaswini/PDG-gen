import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String st = sc.next();

		int max = 0;

		final int ALPHABET_SIZE = 26;

		for(int n=1;n<N-1;n++){
			boolean left[] = new boolean[ALPHABET_SIZE];
			boolean right[] = new boolean[ALPHABET_SIZE];
			Arrays.fill(left,false);
			Arrays.fill(right,false);

			for(int k=0;k<n;k++){
				left[st.charAt(k) - 'a'] = true;
			}
			for(int k=n;k<st.length();k++){
				right[st.charAt(k) - 'a'] = true;
			}
			int cnt = 0;
			for(int a=0;a<ALPHABET_SIZE;a++){
				if(left[a] && right[a]) cnt++;
			}
			if(cnt > max) max = cnt;
		}

		System.out.println(max);

	}
}