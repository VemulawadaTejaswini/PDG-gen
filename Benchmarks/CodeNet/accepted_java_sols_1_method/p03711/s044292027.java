import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int x=scan.nextInt();
		int y=scan.nextInt();
		int[] a= {0 , 1 , 3 , 1 , 2 , 1 , 2 , 1 , 1 , 2 , 1 , 2 , 1};
		System.out.println(a[x]==a[y]?"Yes":"No");
	}

}
