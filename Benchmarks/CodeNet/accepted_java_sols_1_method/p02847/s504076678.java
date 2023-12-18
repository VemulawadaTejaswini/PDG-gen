import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		String[] bruh =  {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		for (int i = 0 ; i < 7 ; i ++ )
			if (s.equals(bruh[i]))
			{
				System.out.println(7-i);
			}
	}

}
