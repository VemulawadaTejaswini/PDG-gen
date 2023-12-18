
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new LinkedList<Integer>();
		while(sc.hasNext()){
			list.add(sc.nextInt()+sc.nextInt());
		}
		for(int i:list){
			System.out.println(i);
		}
	}
}