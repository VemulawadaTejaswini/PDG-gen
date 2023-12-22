import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int shuffle_times, shuffle;
		String str;
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				str = sc.next();
				if(str.equals("-")) {
					break;
				}
				shuffle_times = sc.nextInt();
				for(int i = 0; i < shuffle_times; i++) {
					shuffle = sc.nextInt();
					str = str.substring(shuffle) + str.substring(0,shuffle);
				}
				System.out.println(str);
			}
		}
	}
}

