import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		for(int i=0; i<S.length(); i++) {
			for(int j=0; j<S.length(); j++) {
				if(i==j)continue;
				else {
					if(S.charAt(i)==S.charAt(j)) {
						int k=0;
						int l=0;
						while(k==i | k==j) {
							k++;
						}
						while(l==i | l==j | l==k) {
							l++;
						}
						if(S.charAt(k)==S.charAt(l) && S.charAt(i)!=S.charAt(k)){
							System.out.println("Yes");
							return;
						}
					}
				}
			}
		}
		System.out.println("No");
	}
}
