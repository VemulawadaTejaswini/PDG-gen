
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] tri = new int[3];
		int[] c = new int[3];
		int flag = 1;
		while(true) {
			tri[0] = sc.nextInt();
			tri[1] = sc.nextInt();
			tri[2] = sc.nextInt();
			Arrays.sort(tri);
			if(tri[0]+tri[1] <= tri[2]) {
				System.out.println((c[0]+c[1]+c[2])+" "+c[0]+" "+c[1]+" "+c[2]);
				break;
			}
			int cheak = tri[0]*tri[0] + tri[1]*tri[1] - tri[2]*tri[2];
			if(cheak < 0) c[2]++;
			else if(cheak > 0)c[1]++;
			else c[0]++;
		}
	}
}

