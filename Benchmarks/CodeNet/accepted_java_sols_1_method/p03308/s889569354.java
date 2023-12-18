import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int max=sc.nextInt();
		int min=max;
		int ichiji;
		for(int i=1;i<n;i++) {
			ichiji=sc.nextInt();
			if(max<ichiji)
				max=ichiji;
			if(min>ichiji)
				min=ichiji;
		}

		System.out.print(max-min);




	}

}
