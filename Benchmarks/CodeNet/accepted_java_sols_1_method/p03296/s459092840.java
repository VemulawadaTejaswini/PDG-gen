import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int numMagic = 0;
		int continuity = 1;
		int prevColor = in.nextInt();
		for(int i=1;i<n;i++) {
			int nowColor = in.nextInt();
			if(prevColor==nowColor) {
				continuity++;
			}else {
				numMagic += continuity/2;
				continuity = 1;
				prevColor = nowColor;
			}
		}
		numMagic += continuity/2;
		System.out.println(numMagic);
	}

}