import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String slimes = sc.next();
		int numberOfSlimes = 0;
		char lastColour = 0;
		for(int i = 0; i < N; i++) {
			
			char colourAt = slimes.charAt(i);
			if(colourAt == lastColour) {
				
			}else {
				numberOfSlimes++;
			}
			lastColour = colourAt;
			
		}
		System.out.println(numberOfSlimes);

	}

}
