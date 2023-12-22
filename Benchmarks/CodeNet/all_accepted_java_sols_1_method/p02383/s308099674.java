
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] dice = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
				scanner.nextInt() };
		int oki=0;
		String shiji = scanner.next();
		char[] muki=new char[shiji.length()];
		for(int i=0;i<shiji.length();i++) {
			muki[i]=shiji.charAt(i);
		}
		for(int i=0;i<shiji.length();i++) {
			if(muki[i]=='E') {
				oki=dice[0];
				dice[0]=dice[3];
				dice[3]=dice[5];
				dice[5]=dice[2];
				dice[2]=oki;
			}else if(muki[i]=='N') {
				oki=dice[0];
				dice[0]=dice[1];
				dice[1]=dice[5];
				dice[5]=dice[4];
				dice[4]=oki;
			}else if(muki[i]=='S') {
				oki=dice[0];
				dice[0]=dice[4];
				dice[4]=dice[5];
				dice[5]=dice[1];
				dice[1]=oki;
			}else if(muki[i]=='W') {
				oki=dice[0];
				dice[0]=dice[2];
				dice[2]=dice[5];
				dice[5]=dice[3];
				dice[3]=oki;
			}
		}
		System.out.println(dice[0]);

	}
}
