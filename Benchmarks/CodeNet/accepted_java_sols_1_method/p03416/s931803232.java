import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer output = 0;
		Integer aInteger = new Integer(scanner.next());
		Integer bInteger = new Integer(scanner.next());

		StringBuffer buffer ;
		for(int i = aInteger; i <= bInteger;i++ ) {
			buffer = new StringBuffer(String.valueOf(i));
			if(String.valueOf(i).compareTo(String.valueOf(buffer.reverse()))==0) {
				output++;
			}
		}
		System.out.println(output);
		scanner.close();
	}
}
