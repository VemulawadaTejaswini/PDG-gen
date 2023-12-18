
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		while(s.hasNextInt()){
			int n = s.nextInt();
			boolean[] b = new boolean[n*2];
			for(int i = 0;i<b.length;i++){
				b[i] = true;
			}
			b[0] = b[1] = false;
			for(int i = 0;i<b.length;i++){
				if(!b[i])continue;
				for(int j = 2*i;j<b.length;j += i){
					b[j] = false;
				}
			}
			int x = n - 1;
			while(!b[x])x--;
			int y = n + 1;
			while(!b[y])y++;
			System.out.println(x + " " + y);
		}
	}
}