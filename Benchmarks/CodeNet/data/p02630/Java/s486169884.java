
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int N = Integer.parseInt(scanner.next());
    	ArrayList<Integer> list = new ArrayList<Integer>(N);
    	int sum =0 ;
    	for(int i=0;i<N;i++) {
    		list.add(Integer.parseInt(scanner.next()));
    	}
    	int Q = Integer.parseInt(scanner.next());
    	for(int i=0;i<Q;i++) {
    		Collections.replaceAll(list, Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next()));
    		sum =0;
    		for(int j=0;j<N;j++) {
        		sum += list.get(j);
        	}
        	System.out.println(sum);
    	}
    	scanner.close();
    }
}