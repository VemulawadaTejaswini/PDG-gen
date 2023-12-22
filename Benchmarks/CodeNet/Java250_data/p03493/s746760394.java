import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String[] aArray = a.split("");
		
		int res = 0;
		
		for(int i=0; i<aArray.length; i++) {
			if(aArray[i].equals("1")) {
				res++;
			}
		}
		
		System.out.println(res);
	}

}
