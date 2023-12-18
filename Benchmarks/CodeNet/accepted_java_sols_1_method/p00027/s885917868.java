import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int m = sc.nextInt();
				int d = sc.nextInt();
				if(m+d == 0) break;
				switch(m) {
					case 12 : d+=30;
					case 11 : d+=31;
					case 10 : d+=30;
					case  9 : d+=31;
					case  8 : d+=31;
					case  7 : d+=30;
					case  6 : d+=31;
					case  5 : d+=30;
					case  4 : d+=31;
					case  3 : d+=29;
					case  2 : d+=31;
				}
				String [] day = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
				System.out.println(day[d%7]);
			}
		}
	}
}

