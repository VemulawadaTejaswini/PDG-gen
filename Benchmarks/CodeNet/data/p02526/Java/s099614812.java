import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		TreeSet<Long> list = new TreeSet<Long>();
		
		int numS = stdIn.nextInt();	    //集合Sの読み込み
		for(int r = 0; r < numS; r++) {
			long input = stdIn.nextInt();
			list.add(input);
		}
		
		int numT = stdIn.nextInt();     //集合Tの読み込み
		int count = 0;
		for(int r = 0; r < numT; r++) {
			long input = stdIn.nextInt();
			if(list.contains(input)) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}