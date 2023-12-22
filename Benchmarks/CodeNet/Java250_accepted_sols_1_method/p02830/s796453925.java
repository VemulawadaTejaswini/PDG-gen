import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt();
		char S[] = sc.next().toCharArray();
		char T[] = sc.next().toCharArray();

		char ans[] = new char[S.length + T.length];

		{
			int count = 0;
			for(int i = 0; i < T.length; i ++){
				ans[count] = S[i];
				count ++;
				ans[count] = T[i];
				count ++;
			}
		}

		String temp = new String(ans);
		System.out.println(temp);
	}
}
