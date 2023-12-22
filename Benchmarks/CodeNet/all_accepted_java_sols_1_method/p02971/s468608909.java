
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner scan = new Scanner(System.in);
	        int N  = scan.nextInt();

	        List<Integer> x = new ArrayList<Integer>();
	        List<Integer> y = new ArrayList<Integer>();

	        for(int i=0;i<N;i++) {
	        	x.add(scan.nextInt());
	        	y.add(x.get(i));
	        }
	        x.sort((o1,o2)->o2.compareTo(o1));
	        int max = x.get(0);
	        int max2 = x.get(1);



	        for(int i=0;i<N;i++) {
	        	if(max == y.get(i)) {
	    	        System.out.println(String.valueOf(max2));
	        	}else {
	    	        System.out.println(String.valueOf(max));

	        	}
	        }
	}

}
