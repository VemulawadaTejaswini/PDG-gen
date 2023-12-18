import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			int cycle = scanner.nextInt();
			if(cycle == 0) return;
			
			int count;
			int target;
			
			String text = scanner.next();
			StringBuffer sb = new StringBuffer();
			
			for(int i = 0; i < cycle; i++) {
				sb.setLength(0);
				count = 1;
				target = Integer.valueOf(text.substring(0, 1));
				
				for(int p=1; p<text.length(); p++) {
					if (target == Integer.valueOf(text.substring(p, p+1))) {
						count++;
					} else {
						sb.append(count);
						sb.append(target);
						
						count = 1;
						target = Integer.valueOf(text.substring(p, p+1));
					}
				}
				sb.append(count);
				sb.append(target);
				
				text = sb.toString();
			}
			System.out.println(text);
		}
	}
}