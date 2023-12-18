import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		while(true){
			int x = in.nextInt();
			int y = in.nextInt();
			int s = in.nextInt();
			if(s == 0) break;
			int res = 0;
			for(int i=1; i<s; i++){
				for(int j=1; j<s; j++){
					if(i*(100+x)/100 + j*(100+x)/100 != s
							|| i+j>s) continue;
					res = Math.max(res, i*(100+y)/100+j*(100+y)/100);
				}
			}
			System.out.println(res);
		}
	}
}