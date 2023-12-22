import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String[] wds = str.split("[,. ]");
		
		boolean hasFirst = false;
		
			for (String wd : wds) {
				if (wd.length() < 7 && wd.length() > 2) {
						if (!hasFirst) {
								System.out.print(wd);
								hasFirst = true;
						} else {
								System.out.printf(" %s" ,wd);
						}
				}
			}
			
		System.out.println();
		
	}
}

