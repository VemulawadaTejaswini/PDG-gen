
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			boolean able[] = new boolean[11];
			int c1 = cin.nextInt();
			int c2 = cin.nextInt();
			int c3 = cin.nextInt();
			Arrays.fill(able, true);
			able[c1]=false;
			able[c2]=false;
			able[c3]=false;
			int count=0;
			for(int i = 1; i < 11;i++){
				if(able[i]){
					if(c1+c2+i <= 20){
						count++;
					}
				}
			}
			if(count <= 3){
				System.out.println("NO");
			}
			else if(count >=4){
				System.out.println("YES");
			}
		}
	}

}