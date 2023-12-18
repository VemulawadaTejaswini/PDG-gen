import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String y = s.substring(0, 4);
		String m = s.substring(5, 7);
		String d = s.substring(8, 10);

		int ye = Integer.parseInt(y);
		int mo = Integer.parseInt(m);
		int da = Integer.parseInt(d);

		boolean tbd = true;
		if (ye <= 2018) {
			tbd = false;
		}else if(ye>=2020){
	tbd=true;
}else if(mo<=4){
	tbd=false;

}else{
	tbd=true;
}
		if(tbd){
			System.out.println("TBD");
		}else{System.out.println("Heisei");}



	}
}