import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x  = sc.nextInt();
		int y  = sc.nextInt();
		int a[] = {0,1,3,1,2,1,2,1,1,2,1,2,1};
		if(a[x] == a[y]) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		}
	}
