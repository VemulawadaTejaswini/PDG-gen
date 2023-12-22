import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        int[] wac = new int[100001];
        int[] pass = new int[100001];

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		String[] substr = str.split(" ", 0);

        int n = Integer.parseInt(substr[0]);
        int a = Integer.parseInt(substr[1]);

        if (a == 0) {
    		System.out.println("0 0");
    		return;
        }
		for (int i=0; i<a; i++) {
	        str = scan.nextLine();
	        substr = str.split(" ", 0);

	        int no = Integer.parseInt(substr[0]);
	        String result = substr[1];
	        if (result.equals("WA")) {
	        	if (pass[no] == 0) {
	        		wac[no] += 1;
	        	}
	        } else {
	        	pass[no] = 1;
	        }
		}

		int good = 0;
		int ng = 0;
		for (int i=1; i<n+1; i++) {
			good += pass[i];
			if (pass[i] == 1) {
				ng += wac[i];
			}
		}

		System.out.println(good + " " + ng);

	}
}