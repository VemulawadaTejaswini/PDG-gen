import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		String abc = sc.next();
		String[] abcList = abc.split("");

		if(abcList[Y-1].equals("A")) {
			abcList[Y-1] = "a";
		}else {
			if(abcList[Y-1].equals("B")) {
				abcList[Y-1] = "b";
			}else {
				abcList[Y-1] = "c";
			}
		}

		for(String ans:abcList) {
			System.out.print(ans);
		}
	}
}
