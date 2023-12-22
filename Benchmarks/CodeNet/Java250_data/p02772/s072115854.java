import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = Integer.parseInt(str);

        str = scan.nextLine();
        String[] substr = str.split(" ", 0);

        String ans = "APPROVED";
		for (int i=0; i<n; i++) {
			int target = Integer.parseInt(substr[i]);
			if (target % 2 == 0) {
				if (target % 3 != 0 && target % 5 != 0 )  {
					ans = "DENIED";
				}
			}
		}
		System.out.println(ans);

	}

}
