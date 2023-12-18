import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			
			String str = sc.next();
			int q = sc.nextInt();
			
			StringBuilder sb = new StringBuilder();
			String transform = str;
			
			for(int i = 0; i < q; i++) {
				String command = sc.next();
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				switch(command) {
				case "print":
					sb.append(transform.substring(a, b + 1));
					sb.append("\n");
					break;
				case "reverse":
					transform = transform.substring(0, a)
						+ new StringBuilder(transform.substring(a, b + 1)).reverse().toString()
						+ transform.substring(b + 1);
					break;
				case "replace":
					String p = sc.next();
					transform = transform.substring(0, a) + p + transform.substring(b + 1);
				}
			}

			System.out.print(sb.toString());
		}
	}
}
