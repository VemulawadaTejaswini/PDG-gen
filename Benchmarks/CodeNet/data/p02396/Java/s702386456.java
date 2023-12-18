import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while(i<=10000){
			int x = scan.nextInt();
			if(1<=x&&x<=10000){
				System.out.println("Case "+i+": "+x);
			}else if(x == 0){
				break;
			}
			i++;
		}

	}

}