import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0028().doIt();
	}
	
	class AOJ0028{
		void doIt(){
			int[] index = new int[101];
			while(in.hasNext())index[in.nextInt()]++;
			int max = 0;
			for(int i=0;i<101;i++)max = Math.max(max, index[i]);
			for(int i=0;i<101;i++)if(max==index[i])System.out.println(i);
		}
	}
}