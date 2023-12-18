import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	int tmp;
	int num[] = new int[3];

	while (scan.hasNext()) {
	    String line = scan.nextLine();

	    if (line.length() < 3) {
		continue;
	    }
	    else {
		String spl[] = line.split("[\\s]+");

		for (int i=0; i<3; i++) {
		   tmp = Integer.parseInt(spl[i]);
		   num[i] = tmp * tmp;
		}

		if ((num[0] == num[1]+num[2]) || (num[1] == num[2]+num[0])
		    || (num[2] == num[0]+num[1])) {
		    System.out.println("OK");
		}
		else {
		    System.out.println("NO");
		}
	    }
	}
    }
}