import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		String W = s.next().toLowerCase();
		String T="";
		String txt = "";
		int cnt=0;
		while(!"END_OF_TEXT".equals(txt)){
			T += txt.toLowerCase();
			txt = s.nextLine();
		}
		Pattern p = Pattern.compile(W);
		Matcher mch = p.matcher(T);
		while(mch.find()){
			cnt++;
			mch.region(mch.end(),T.length());
		}
		System.out.println(cnt);
	}
	public static void main(String args[]){
		new Main().run();
	}
}