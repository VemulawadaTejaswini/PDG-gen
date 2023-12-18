import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String args[]) throws IOException {


		int yakusu;
		int bunkatu;
		long ans;
		while(true) {
			Scanner sc=new Scanner(System.in);
			yakusu=sc.nextInt();
			bunkatu=600/yakusu;

			ans=0;
			for(int i=0; i<bunkatu; i++) {
				ans+=(yakusu*i)*(yakusu*i)*yakusu;
			}
			System.out.println(ans);
			sc.close();
		}

	}
}
