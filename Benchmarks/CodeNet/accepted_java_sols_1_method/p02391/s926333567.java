import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		// ?????????????????§??°?????\???
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String array[] = line.split(" ");
		Integer a = Integer.parseInt(array[0]);
		Integer b = Integer.parseInt(array[1]);
		scanner.close();
		
		if (a < b) {
		System.out.println("a < b");	
		} else if(a > b) {
		System.out.println("a > b");	
		} else {
		System.out.println("a == b");	
		}
		
	}

}