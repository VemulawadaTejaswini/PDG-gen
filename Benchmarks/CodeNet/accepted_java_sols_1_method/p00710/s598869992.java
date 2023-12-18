import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt(), r = in.nextInt();
			if(n==0 && r==0) return ;
			int ps[] = new int[r], cs[] = new int[r];
			for(int i=r-1; i>=0; i--){
				ps[i] = in.nextInt();
				cs[i] = in.nextInt();
			}
			int pos = n;
			for(int i=0; i<r; i++){
				if(n-pos+1 <= cs[i]){
					pos -= ps[i] - 1;
				}
				else if(n-pos+1 < cs[i] + ps[i]){
					pos += cs[i];
				}
			}
			System.out.println(pos);
		}
	}
}