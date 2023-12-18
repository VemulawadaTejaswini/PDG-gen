import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for(int j=1;j<=n;j++){
			String s = scan.nextLine();
			int ans = Integer.parseInt(s);
			System.out.println("Case "+j+":");
			for(int i=0;i<10;i++){
				ans = ((ans*ans)%1000000)/100;
				System.out.println(ans);
			}
		}
	}
}