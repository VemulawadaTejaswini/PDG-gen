import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		long min = 10000000000l,max = -1000,buf = 0;
		int n;
		while((n = scn.nextInt())!=0) {
			for(int i = 0;i < n;i++) {
				 buf += scn.nextLong();
				 max = Math.max(max, buf);
				 min = Math.min(min, buf);
			}
			System.out.println(max - min);
		}
		scn.close();
	}

}

