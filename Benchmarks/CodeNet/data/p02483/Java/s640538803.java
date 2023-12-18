import java.util.Scanner;
import java.util.*;

class Main{

	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for ( int cnt = 0;cnt < 3;cnt++ ){
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		System.out.printf("%d %d %d\n",list.get(0),list.get(1),list.get(2));

    }
}