import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String s=sc.nextLine();
			int num=0;
			for(int i=0; i<4; i++) {
				if(s.charAt(i)=='+') {
					num++;
				}
				else {
					num--;
				}
			}
			System.out.println(num);
			
			
		}
	}
}

