import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String s = sc.nextLine(); 
		if (s.length()%2==0) {
			System.out.println("Yes");
			return; 
		}
		int N = s.length(); 
		String s1 = s.substring(0, (N-1)/2);
		String s2 = s.substring((N+3)/2-1, N); 
		String res = s2 + s.charAt((N+1)/2-1) + s1; 
		if (res.equals(s)) System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}

}