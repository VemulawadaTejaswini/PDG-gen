import java.util.Scanner;

//20180510
//06

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String search = scanner.nextLine();
		String end = "END_OF_TEXT";
		int count = 0;

		while (scanner.hasNextLine()) {
			String string = scanner.next();
			if(string.contains(end)) {
				break;
			}
			if(string.equalsIgnoreCase(search)) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
    }
}
