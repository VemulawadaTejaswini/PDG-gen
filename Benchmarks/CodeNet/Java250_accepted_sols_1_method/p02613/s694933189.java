import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = "";
        int ACCount = 0;
        int WACount = 0;
        int TLECount = 0;
        int RECount = 0;

        for(int i = 0; i <= N; i++) {
        	str = sc.nextLine();
        	if("AC".equals(str)) {
        		ACCount++;

        	} else if("WA".equals(str)) {
        		WACount++;
        	} else if("TLE".equals(str)) {
        		TLECount++;
        	} else if("RE".equals(str)) {
        		RECount++;
        	}
        }

        System.out.println("AC x \n" + ACCount);
        System.out.println("WA x \n" + WACount);
        System.out.println("TLE x \n" + TLECount);
        System.out.println("RE x \n" + RECount);

    }
}