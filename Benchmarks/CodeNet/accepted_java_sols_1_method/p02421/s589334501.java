import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turnNum = sc.nextInt();
        int tPoint = 0;
        int hPoint = 0;

        for(int i = 0; i < turnNum; i++) {
        	String tStr = sc.next();
        	String hStr = sc.next();

        	int check = tStr.compareTo(hStr);
        	if(check < 0) {
        		hPoint += 3;
        	} else if(check == 0) {
        		tPoint += 1;
        		hPoint += 1;
        	} else if(check > 0) {
        		tPoint += 3;
        	}

        }

        System.out.println(tPoint + " " + hPoint);

    }
}
