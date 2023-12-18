import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main{

	public static void main(String args[]) throws NoSuchElementException{

		Scanner sc=new Scanner(System.in);
		String st="";
		int yakusu;
		int bunkatu;
		long ans;
		while(true) {
				sc=new Scanner(System.in);
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
