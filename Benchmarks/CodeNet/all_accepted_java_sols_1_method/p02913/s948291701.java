import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();
		
		long B1 = 1007;
		long B2 = 1009;
		long MOD1 = 1000000007;
		long MOD2 = 1000000009;
		
		long[][][] hash = new long[2][N/2+1][N];
		for(int i=0; i<2; i++)
			Arrays.fill(hash[i][0], 1);
		for(int i=0; i<N; i++) {
			for(int j=0; j<N/2 && i+j<N; j++) {
				hash[0][j+1][i] = (hash[0][j][i]*B1+(s[i+j]-'a'))%MOD1;
//				hash[1][j+1][i] = (hash[1][j][i]*B1+(s[i+j]-'a'))%MOD2;
//				hash[2][j+1][i] = (hash[2][j][i]*B2+(s[i+j]-'a'))%MOD1;
//				hash[3][j+1][i] = (hash[3][j][i]*B2+(s[i+j]-'a'))%MOD2;
				hash[1][j+1][i] = (hash[1][j][i]*B2+(s[i+j]-'a'))%MOD2;
			}
		}
		
		for(int i=N/2; i>=0; i--) {
			HashSet<Long> set1 = new HashSet<>();
			HashSet<Long> set2 = new HashSet<>();
//			HashSet<Long> set3 = new HashSet<>();
//			HashSet<Long> set4 = new HashSet<>();
			for(int j=i; j<=N-i; j++) {
				set1.add(hash[0][i][j-i]);
				set2.add(hash[1][i][j-i]);
//				set3.add(hash[2][i][j-i]);
//				set4.add(hash[3][i][j-i]);
//				if(set1.contains(hash[0][i][j]) && set2.contains(hash[1][i][j]) && set3.contains(hash[2][i][j]) && set4.contains(hash[3][i][j])) {
				if(set1.contains(hash[0][i][j]) && set2.contains(hash[1][i][j])) {
					System.out.println(i);
					sc.close();
					return;
				}
			}
		}
		
		sc.close();
	}
}

