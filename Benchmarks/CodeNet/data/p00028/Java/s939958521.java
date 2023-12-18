import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0028();
	}
	class AOJ0028{
		public AOJ0028() {
			int[] data = new int[101];
			while(in.hasNext())data[in.nextInt()]++;
			int max=Integer.MIN_VALUE;
			for(int i=1;i<101;i++)max = Math.max(max, data[i]);
			for(int i=1;i<101;i++)if(max==data[i])System.out.println(i);
		}
	}

}