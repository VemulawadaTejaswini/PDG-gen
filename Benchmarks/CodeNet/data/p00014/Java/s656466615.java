import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String args[]) throws IOException {

		Scanner sc=new Scanner(System.in);
		String st="";
		int yakusu;
		int bunkatu;
		long ans;
		while(true) {
			if(sc==null) {
				System.exit(0);
			}
			yakusu=sc.nextInt();
			bunkatu=600/yakusu;

			ans=0;
			for(int i=0; i<bunkatu; i++) {
				ans+=(yakusu*i)*(yakusu*i)*yakusu;
			}
			System.out.println(ans);
		}

	}
}
