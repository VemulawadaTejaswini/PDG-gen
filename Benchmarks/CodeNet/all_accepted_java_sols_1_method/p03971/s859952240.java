import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int pass = 0;
		int b_pass = 0;
		String S = sc.next();
		for(int i = 0; i < S.length(); i ++){
			switch(S.charAt(i)){
			case 'a':
				if(pass < A + B){
					System.out.println("Yes");
					pass++;
				}else{
					System.out.println("No");
				}
				break;
			case 'b':
				if(pass < A + B && b_pass < B){
					System.out.println("Yes");
					pass++;
					b_pass++;
				}else{
					System.out.println("No");
				}
				break;
			default:
				System.out.println("No");
				break;
			}
		}
	}
}