import java.util.Scanner;

public class J0101{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = Integer.parseInt(s);
		
		for(int i=0; i<n; i++){
			s = sc.nextLine();
			s = s.replaceAll("Hoshino", "Hoshina");
			System.out.println(s);
		}
				
	}
} 