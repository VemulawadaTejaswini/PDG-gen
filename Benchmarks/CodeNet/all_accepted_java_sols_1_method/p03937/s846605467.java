import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		int endPoint = 1;
		
		for (int i = 1; i <= h; i++) {
			String str = sc.next();
			char charArray[] = str.toCharArray();
			
			for (int j = 1; j <= w; j++) {
				if (charArray[j - 1] == '.') {
					continue;
				}
				if (j < endPoint) {
					System.out.println("Impossible");
					sc.close();
					return;
				}
				endPoint = j;
			}
		}
		
		System.out.println("Possible");
		sc.close();
	}
}