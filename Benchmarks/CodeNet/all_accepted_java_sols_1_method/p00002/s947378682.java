import java.util.Scanner;

class Main{
    public static void main(String[] a){
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		while(scanner.hasNext()) {
			num = scanner.nextInt() + scanner.nextInt();
			System.out.println((num + "").length());
		}
		
		scanner.close();
    }
}
