import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		while(scan.hasNext()){
			int d = Integer.parseInt(scan.next());
			int n = 600;
			int m = 0;
			for(int i = d;i < n;i += d){
				m += d*Math.pow(i,2);
			}
			System.out.println(m);
		}
		System.exit(0);
	}

}