import java.util.Scanner;
 
class Main {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int j = s.nextInt();
		s.close();
		System.out.println(i*j+" "+(i*2 + j*2));
	}
}