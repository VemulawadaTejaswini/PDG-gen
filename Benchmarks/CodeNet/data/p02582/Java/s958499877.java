import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String record = sc.next();
		sc.close();

		int result = 0;
		if(record.indexOf("R") > -1) {
			result = 1;
		}

		if(record.indexOf("RR") > -1) {
			result = 2;
		}

		if(record.indexOf("RRR") > -1) {
			result = 3;
		}

		System.out.println(result);

	}

}