import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                String S = scan.next();


                int count = 0;
                int max = 0;

                for (int i = 0; i < 3; i++) {
                	if (S.substring(i,i+1).equals("R")) {
                		count++;
                		if (max < count) {
                			max = count;
                		}
                	} else {
                		if (max < count) {
                			max = count;
                		}
                		count = 0;
                	}
                }

                System.out.println(max);

                scan.close();

        }
}