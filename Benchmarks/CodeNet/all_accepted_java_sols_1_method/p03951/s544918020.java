import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		sc.close();
		
		int pos = n;
		for(int i= 0; i<n; i++){
			pos = n;
			boolean c = true;
			for(int j=i; j<n; j++){
				if(s[j] != t[j-i]){
					c = false;
					break;
				}
			}
			if(c){
				pos = i;
				break;
			}
		}
		
		System.out.println(pos+n);
	}

}