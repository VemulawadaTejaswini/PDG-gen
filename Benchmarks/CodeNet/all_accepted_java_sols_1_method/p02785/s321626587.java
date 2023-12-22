import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
	    int N = scanner.nextInt();
	    int K = scanner.nextInt();
	    if(K>N) {
	    	System.out.println(0);
	    }else {
	    List<Integer> list = new ArrayList<Integer>();
	    for(int i=0;i< N;i++){
	    	list.add(i,scanner.nextInt());
	    }
	    Collections.sort(list,Collections.reverseOrder());
	     long sum = 0;
	     for(int i = K;i < N; i++) {
	    	 sum = list.get(i) + sum;
	     }
	     System.out.println(sum);
	}
	}
}
