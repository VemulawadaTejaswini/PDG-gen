import java.util.*;
public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String[] inArray = in.split(" ");
		int count5 = 0;
		int count7 = 0;
		for (int i = 0; i < inArray.length; i++) {
			if (inArray[i].equals("5")) {
				count5++;
			} else if (inArray[i].equals("7")) {
				count7++;
			}
		}
		if ((count5 == 2) && (count7 ==1)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}
	

}
