import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String S = sc.next();
		String[] s = S.split("");
		int[][] qs = new int[q][2];
		for(int i=0; i<q; i++){
			qs[i][0] = sc.nextInt();
			qs[i][1] = sc.nextInt();
		}
		
		int[] acs = new int[n];
		int a = 0;
		for(int i=0; i<n; i++){
			if(a == 1 && s[i].equals("C")){
				acs[i] = acs[i-1] + 1;
			}
			else{
				if(i == 0){
					acs[i] = 0;
				}
				else{
					acs[i] = acs[i-1];
				}
			}
			
			if(s[i].equals("A")){
				a = 1;
			}else{
				a = 0;
			}
		}
		
		for(int i=0; i<q; i++){
			System.out.println(acs[qs[i][1]-1]-acs[qs[i][0]-1]);
		}
		
	}
}
