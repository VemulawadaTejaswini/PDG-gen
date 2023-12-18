import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int indexStart = s.indexOf("A");
		int indexEnd = 0;
		String[] sArray = s.split("");
		for(int i = s.length()-1;i >= 0;i--) {
			if(sArray[i].equals("Z")) {
				indexEnd = i;
				break;
			}
		}
		System.out.println(indexEnd - indexStart +1);
	}

}