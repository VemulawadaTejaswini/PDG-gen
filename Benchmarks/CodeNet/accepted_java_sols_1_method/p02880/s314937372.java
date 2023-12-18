import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	int N1 = sc.nextInt();
	int tmp = 0;
	String ans = "No";

	for(int i = 1;i<10;i++)	{
        tmp = N1 / i;
		if ((N1 % i == 0)) {
			for (int j = 1; j < 10; j++) {
				if ((tmp % j == 0 ) && ((tmp / j) == 1 )) {
					ans = "Yes";
					System.out.println(ans);
					return;
				}
			}
		}
	}

	System.out.println(ans);
    }
}
