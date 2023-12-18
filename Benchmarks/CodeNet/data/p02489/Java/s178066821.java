import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		for(int i = 0;i>0;i++){
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			if(x==0) break;
			System.out.println("Case "+i+": "+x);
		}
	}
}