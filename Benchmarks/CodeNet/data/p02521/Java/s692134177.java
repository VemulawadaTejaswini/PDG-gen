import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int r = sc.nextInt();
			int c = sc.nextInt();
			if(r==0&&c==0)break;
			System.out.println(r%2==1&&c%2==1?"yes":"no");
		}
	}
}