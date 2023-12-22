import java.util.Scanner;


public class Main {
	static String[] a = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	static String[] b = new String[] {"D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"};
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int amount = 0;
		while(stdIn.hasNext()) {
			count++;
			String tmp = stdIn.next();
			String[] tmpA = tmp.split(",");
			int v = Integer.parseInt(tmpA[0]);
			int a = Integer.parseInt(tmpA[1]);
			sum += v*a;
			amount += a;
		}
		double tmpAve = (double)amount / (double)count;
		int tmpAAve = amount / count;
		if(tmpAve%1.0 >= 0.5) {
			tmpAAve += 1;
		}
		System.out.println(sum +"\n"+tmpAAve);
	}
	
}