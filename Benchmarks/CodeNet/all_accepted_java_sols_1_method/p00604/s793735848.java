import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			int ns[] = new int[n];
			for(int i=0; i<n; i++)
				ns[i] = in.nextInt();
			Arrays.sort(ns);
			int ans = 0, accum = 0;
			for(int i=0; i<n; i++){
				accum += ns[i];
				ans += accum;
			}
			System.out.println(ans);
		}
	}

}