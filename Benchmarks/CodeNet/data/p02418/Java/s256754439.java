import java.util.Scanner;

class Main {
  public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String roop = scanner.next();
		String search = scanner.next();
  		
  		roop = roop.concat(roop);
  		
  		int result = roop.lastIndexOf(search);
  	
		if (result != -1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		scanner.close();
  }
}
