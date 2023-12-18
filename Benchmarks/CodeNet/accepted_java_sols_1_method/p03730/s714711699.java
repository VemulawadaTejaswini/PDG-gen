import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt(), c = sc.nextInt();
		int result = 0;
		for(int i = 1; i <= b; i++) {
			if(a*i%b==c)result = 1;
		}
		if(result == 1)System.out.print("YES");
		else System.out.print("NO");
	}

}
