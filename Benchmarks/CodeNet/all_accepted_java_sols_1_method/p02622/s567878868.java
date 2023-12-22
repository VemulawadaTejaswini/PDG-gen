import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=0;
		String str1 = in.next();
		String str2 = in.next();
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
				n++;
		}
		System.out.print(n);
	}

}
