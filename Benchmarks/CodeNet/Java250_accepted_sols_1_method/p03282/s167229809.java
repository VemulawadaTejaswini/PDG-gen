import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		String s =sc.next();
		long k=sc.nextLong();
		char ss[] = s.toCharArray();

		char answer= '1';

		for (int i=0;i<k && i<ss.length && answer == '1';++i){
			answer= ss[i];
		}

		System.out.println(answer);
	}

}