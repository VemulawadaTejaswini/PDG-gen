import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int[] k = new int[n];
			for(int i=0;i<n;i++){
				k[i] = stdIn.nextInt();
			}
			stdIn.nextLine();		// 空回し
			String s = stdIn.nextLine();
			String ans = "";
			int idx = -1;
			for(int i=0;i<s.length();i++){
				if(++idx==n) idx = 0;
				int temp1 = Integer.valueOf(s.charAt(i))-k[idx];
				if(temp1<'A') temp1+='z'-'A'+1;
				else if(temp1<'a'&&s.charAt(i)>='a') temp1-='a'-'Z'-1;
				String temp = String.valueOf(Character.toChars(temp1));
				ans+=String.valueOf(temp);
			}
			System.out.println(ans);
		}
	}
}