import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		
		while(sc.hasNext() && count < 201){
			
				String a = sc.nextLine();
	            String[] array = a.split(" ");
				int x = Integer.parseInt(array[0]);
				int y = Integer.parseInt(array[1]);
				int val = x+y;
				int valLen = String.valueOf( val ).length();
				System.out.println(valLen);
			
				count++;
			
		}
	}
}