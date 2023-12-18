
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {

		int K;
		String S;

		Scanner sc1=new Scanner(System.in);
		K=sc1.nextInt();

		Scanner sc2=new Scanner(System.in);
		S=sc2.nextLine();

		if(S.length()<=K) {
			System.out.println(S);
		}else if(S.length()>K){
			System.out.println(S.substring(0,K)+"...");
		}

	}
}
