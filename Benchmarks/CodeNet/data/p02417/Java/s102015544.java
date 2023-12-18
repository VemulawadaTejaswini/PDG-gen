import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char chLow = 'a';
		char chUpp = 'A';

		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			sb.append(sc.nextLine());
		}

		char[]car  = sb.toString().toCharArray();

		int count;
		for(int i = 0; i < 26;i++) {
			count=0;
			for(int j = 0;j<car.length;j++) {
				if(car[j]==chLow || car[j]==chUpp) {
					count++;
				}
			}
			System.out.println(chLow +" : "+count);
			chLow+=1;
			chUpp+=1;
		}

	}
}
