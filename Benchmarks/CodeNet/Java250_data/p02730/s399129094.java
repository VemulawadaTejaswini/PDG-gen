import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		char[] c = line.toCharArray();
		String ans = "Yes";
		int n = c.length;
		for(int i = 0; i < n; i++){
			if(c[i] != c[(n - 1) - i]){
				ans = "No";
			}
		}
		for(int i = 0; i < (n/2); i++){
			if(c[i] != c[((n - 1)/2 - 1) - i]){
				ans = "No";
			}
			if(c[(n + 1)/2 + i] != c[(n - 1) - i]){
				ans = "No";
			}
		}
		System.out.println(ans);
 	}
}