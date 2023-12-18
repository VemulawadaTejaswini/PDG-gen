import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String w = sc.nextLine();
			int sum = 0;

			w = w.toLowerCase();

			while(sc.hasNext()) {
				String t = sc.nextLine();
				String[] data = t.split(" ");

				for(int i = 0; i < data.length; i++) {
					data[i] = data[i].toLowerCase();
					if(data[i].equals(w)) {
						sum++;
					}
				}
				if(t == "END_OF_TEXT") {
					System.out.println();
					break;
				}
			}
			System.out.println(sum);
		}
	}
}

