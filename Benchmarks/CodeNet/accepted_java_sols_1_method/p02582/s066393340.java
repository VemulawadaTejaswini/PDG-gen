import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
           String ww = sc.next();

           int ans = 0;
           if (ww.equals("RRR") ) {
        	   ans = 3;
           } else if (ww.contains("RR")) {
        	   ans = 2;
           } else if (ww.contains("R")) {
        	   ans = 1;
           }

            System.out.println(ans);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
