import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String W = sc.nextLine();
		String T;
		
		String[] strArray;

		int count=0;
		String delete;

		while (sc.hasNextLine()) {
		    T =sc.nextLine().toLowerCase();
		    strArray = T.split(" ");
	 		for(String str : strArray) {
    			if(str.equals(W)) {
    				count++;
    			}
		}
		}

		System.out.println(count);

	}
}
