
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		int K=sc1.nextInt();
		Scanner sc2=new Scanner(System.in);
		String S=sc2.nextLine();

		if(S.length()<=K) {
			System.out.println(S);
		}else {
			System.out.println(S.substring(0,K)+"...");
			//System.out.println("...");
		}


	}
}
