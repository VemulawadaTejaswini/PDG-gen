import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String fow = new String();
		
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++){
			String str = input.next();
			if (i == 0 || fow.compareTo(str) > 0) fow = str;
		}
		
		System.out.println(fow);
	}
}