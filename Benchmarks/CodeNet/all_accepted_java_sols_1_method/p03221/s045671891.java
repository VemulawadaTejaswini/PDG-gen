import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] cou = new int[n+1];
		int[][] s = new int[m][3];
		for(int i = 0; i < m; i++){
			s[i][0] = sc.nextInt();
			s[i][1] = sc.nextInt();
			s[i][2] = i;
		}
		Arrays.sort(s,(a,b)->Integer.compare(a[1],b[1]));
		String[] an = new String[m];
		for(int i = 0; i < m; i++){
			an[s[i][2]] = String.format("%06d%06d",s[i][0],++cou[s[i][0]]);
		}
		for(String a : an){
			System.out.println(a);
		}
	}
}
