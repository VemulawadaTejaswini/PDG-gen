import java.util.Scanner;

class Main {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.useDelimiter("\\r\\n");
		while(s.hasNext())
			System.out.print(s.next().toUpperCase());
    }
}