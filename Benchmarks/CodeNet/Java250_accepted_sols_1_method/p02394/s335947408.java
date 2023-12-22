import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		int rs=x+r;
		int ls=x-r;
		int u=y+r;
		int d=y-r;
		if(W >= rs && ls >= 0 && H >= u && d >= 0){
				System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}