import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String S=sc.next();
		boolean f=true;
		for(int i=0;i<S.length()/2;i++) {
			if(S.charAt(i)!=S.charAt(S.length()-i-1)) {
				f=false;
				break;
			}
		}
		for(int i=0;i<S.length()/4;i++) {
			if(S.charAt(i)!=S.charAt(S.length()/2-i-1)) {
				f=false;
				break;
			}
		}
		System.out.println(f?"Yes":"No");
	}
}