import java.io.IOException;
import java.util.Scanner;


public class Main{
	public static void main(String args[]) throws IOException{
		Scanner bf = new Scanner(System.in);
		int N = bf.nextInt();
		for(int n=0; n<N; n++){
			boolean failed = false;
			int a = 0;
			int b = 0;
			for(int i=0; i<10; i++){
				int tmp = bf.nextInt();
				if(tmp < a && tmp < b) failed = true;
				else if(tmp > a && tmp > b){
					if(a>b) a = tmp;
					else b = tmp;
				}else if(tmp > a) a = tmp;
				else b = tmp;
			}
			if(failed) System.out.println("NO");
			else System.out.println("YES");
		}
	}
}