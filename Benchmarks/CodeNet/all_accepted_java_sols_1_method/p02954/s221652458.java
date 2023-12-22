import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] n = new int[s.length()];
		for(int i=0;i<s.length();i++) {
			n[i] =0;
		}
		int j=Integer.MIN_VALUE,k=Integer.MAX_VALUE;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='R') {
				if(j<i) {
					k=Integer.MAX_VALUE;
					for(j=i;j<s.length();j++) {
						if(s.charAt(j)=='L') {
							break;
						}
					}
				}
				if(((j-i)%2) == 1) {
					n[j-1]++;
				}else {
					n[j]++;
				}
			}else {
				if(k>i) {
					for(k=i;k>=0;k--) {
						if(s.charAt(k)=='R') {
							break;
						}
					}
				}
				
				if(((i-k)%2) == 1) {
					n[k+1]++;
				}else {
					n[k]++;
				}
			}
		}
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
		
	}
}