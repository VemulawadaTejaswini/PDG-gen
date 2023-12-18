import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	
	static boolean[] prime = new boolean[60000];
	static int[] bp = new int[60000];
	static int[] np = new int[60000];
	
	public static void main(String[] args){
		ersis();
		while(scan.hasNext()){
			int n = si();
			out.println(bp[n]+" "+np[n]);
		}
		out.flush();
	}
	
	static void ersis(){
		prime[0] = prime[1] = true;
		for (int i = 0; i*i < 60000 ; i++){
			if(!prime[i]){
				for (int j = i*2; j < 60000 ; j+=i)
					prime[j] = true;
			}
		}
		int tmp = 0;
		for (int i = 0; i < 60000; i++){
			if(!prime[i]){
				bp[i] = tmp;
				np[tmp] = i;
				tmp = i;
			}
		}
	}
	
	static int si(){
		return Integer.parseInt(scan.next());
	}
}