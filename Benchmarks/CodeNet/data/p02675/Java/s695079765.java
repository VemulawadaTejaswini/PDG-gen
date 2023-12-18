import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			String N = scn.next();
			String c = N.substring(N.length()-1);

			if(c.equals("2")
			|| c.equals("4")
			|| c.equals("5")
			|| c.equals("7")
			|| c.equals("9")
			) {
				System.out.println("hon");
			} else if(c.equals("0")
					|| c.equals("1")
					|| c.equals("6")
					|| c.equals("8"))
			{
					System.out.println("pon");
			} else {
				System.out.println("bon");
			}
		}
	}
}