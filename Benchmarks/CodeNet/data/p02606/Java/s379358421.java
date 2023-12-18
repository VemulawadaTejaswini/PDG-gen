import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int m = sc.nextInt();
	
		int count =0 ;
		for(int i=l ;i<=r;i++) {
			if(i%m == 0)
				count++;
		}
		System.out.println(count);
	}

}