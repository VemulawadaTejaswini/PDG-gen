import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			String S = scan.next();
			String T = scan.next();

			char[]s = S.toCharArray();
			char[]t = T.toCharArray();
			int max = 0;

			for(int i = 0;i<=s.length-t.length;i++) {
				int count = 0;

				for(int j = 0;j<t.length;j++) {
					if(s[i+j]==t[j]) {
						count++;
					}
				}
				//System.out.println(count);
				if(max<count)max = count;

			}


			System.out.println(T.length()-max);



		}


	}


}
