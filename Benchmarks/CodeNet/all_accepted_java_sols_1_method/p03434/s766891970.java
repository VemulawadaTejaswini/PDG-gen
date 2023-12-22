import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		List<Integer> list = new ArrayList<Integer>();
		while(scan.hasNext()){
			list.add(scan.nextInt());
		}
		Collections.sort(list, Comparator.reverseOrder());

		int Alice = 0;
		int Bob = 0;
		for(int i = 0; i < N; i++){
			if(i%2 == 0){
				Alice += list.get(i);
			}else{
				Bob += list.get(i);
			}
		}
		System.out.println(Alice - Bob);
	}
}