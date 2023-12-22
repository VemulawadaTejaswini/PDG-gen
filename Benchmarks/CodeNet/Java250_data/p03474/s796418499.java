import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		sc.close();
		
		boolean flag = true;
		for(int i = 0;i < A;++i)
			if(!('0' <= S.charAt(i) && S.charAt(i) <= '9'))
				flag = false;
		if(S.charAt(A) != '-')
			flag = false;
		for(int i = 0;i < B;++i)
			if(!('0' <= S.charAt(A + 1 + i) && S.charAt(A + 1 + i) <= '9'))
				flag = false;
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
