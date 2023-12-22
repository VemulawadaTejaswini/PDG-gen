import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer output = 0;
		Integer sum = 0;
		Integer buf =0;
		Integer nInteger = new Integer(scanner.next());
		Integer aInteger = new Integer(scanner.next());
		Integer bInteger = new Integer(scanner.next());

		for(int i = 1;i <= nInteger;i++) {
			buf = i;
			sum = 0;
			while(buf != 0){
				sum += buf%10;
				buf /= 10;
			}
			if(sum >= aInteger && sum <= bInteger) {
				output +=i ;
			}
		}

		System.out.println(output);
		scanner.close();
	}
}
