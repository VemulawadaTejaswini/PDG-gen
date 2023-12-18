import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		String s = "";
		for (int i = 0; i < q; i++) {
			int p = sc.nextInt();
			String c = sc.next();
			int n = sc.nextInt();
			String str = "";
			for (int j = 0; j < n; j++)
				str += c;
			s = s.substring(0, p) + str + s.substring(p);
			int result = 0;
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)==s.charAt(0))
					result++;
				else
					result--;
			}
			if(result==0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		sc.close();
	}
}