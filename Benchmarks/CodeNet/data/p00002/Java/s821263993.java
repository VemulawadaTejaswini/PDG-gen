import java.util.Scanner;

public class Main {
	public static void main(String a[]){	
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int s = b+c;
			int d = 0;
			while(s!=0){
				s = s/10;
				d++;
			}
			System.out.println(d);
		}
		scanner.close();
	}
}

