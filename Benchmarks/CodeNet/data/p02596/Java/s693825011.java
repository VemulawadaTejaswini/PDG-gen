import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int l = Integer.toString(k).length();
		String repi = "7".repeat(l);
		while (true) {
			try {
				if (Integer.parseInt(repi) % k == 0) {
					System.out.print(repi.length());
					break;
				}else {
					repi += "7";
				}
			}catch(Exception ex){
				System.out.print(-1);
				break;
			}
		}
	}

}