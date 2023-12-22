import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
            char[] c1 = sc.nextLine().toCharArray();
            char[] c2 = sc.nextLine().toCharArray();

            int len = c1.length;
            int counter = 0;

            for (int i = 0; i < len; i++) {
            	if  (c1[i] != c2[i]) counter++;
            }



            System.out.println(counter);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}