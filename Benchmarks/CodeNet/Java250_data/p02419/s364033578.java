import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		String W = s.next().toLowerCase();
		String T="";
		String txt = "";
		int cnt=0;
		while(true){
			if(W.equals(txt))cnt++;
			txt = s.next();
			if("END_OF_TEXT".equals(txt)){
				break;
			}
			txt = txt.toLowerCase();
		}
		System.out.println(cnt);
	}
	public static void main(String args[]){
		new Main().run();
	}
}