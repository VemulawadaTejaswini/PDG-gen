import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		char[] charList = S.toCharArray();
		int n = S.length();

        boolean condition = false;

        String left = S.substring(0, (n-1)/2-1);
        String right = S.substring((n-1)/2+1, n-1);
        if(left.equals(right))
        {
        	if(charList[0] == charList[((n-1)/2)-1])
        	{
        		if(charList[((n+3)/2)-1] == charList[n-1])
        		{
        			condition = true;
        		}
        	}
        }

        if(condition)
        	System.out.println("Yes");
        else
        	System.out.println("No");
	}
}
