import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String args[]) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String sc="";
		while(true) {
			sc=br.readLine();
			int yakusu=Integer.parseInt(sc);
			int bunkatu=600/yakusu;
			long ans=(bunkatu*(bunkatu+1))*(bunkatu*(bunkatu+1))*(yakusu*yakusu*yakusu)/12;
			System.out.println(""+ans);
		}
	}
}
