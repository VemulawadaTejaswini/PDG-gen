import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		
		int w = n.nextInt();
		int h = n.nextInt();
		int x = n.nextInt();
		int y = n.nextInt();
		int r = n.nextInt();
		boolean flag = true;
		if ((x + r) > w || (y + r) > h){
			System.out.println("No");
		}else{
		System.out.println("Yes");
		}
		
	}

}