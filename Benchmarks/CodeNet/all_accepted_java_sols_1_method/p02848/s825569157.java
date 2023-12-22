import java.util.*;
public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String ans = "";
		char[] A = new char[26];
		A[0] = 'A';
		A[1] = 'B';
		A[2] = 'C';
		A[3] = 'D';
		A[4] = 'E';
		A[5] = 'F';
		A[6] = 'G';
		A[7] = 'H';
		A[8] = 'I';
		A[9] = 'J';
		A[10] = 'K';
		A[11] = 'L';
		A[12] = 'M';
		A[13] = 'N';
		A[14] = 'O';
		A[15] = 'P';
		A[16] = 'Q';
		A[17] = 'R';
		A[18] = 'S';
		A[19] = 'T';
		A[20] = 'U';
		A[21] = 'V';
		A[22] = 'W';
		A[23] = 'X';
		A[24] = 'Y';
		A[25] = 'Z';
		for(int i = 0; i < s.length(); i++) {
			char tp = s.charAt(i);
			for(int p = 0; p <= 25; p++) {
				if(p + n >= 26 && A[p] == tp) {
					tp = A[p + n - 26];
					break;
				}
				if(A[p] == tp) {
					tp = A[p + n];
					break;
				}
			}
			ans = ans + tp;
		}
		System.out.println(ans);
     }
}