import java.util.*;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		int n = 0;
		array.add(Integer.parseInt(scan.next()));
		while(scan.hasNext()){
			int m = Integer.parseInt(scan.next());
			if(m == 0){
				System.out.println(array.get(n));
				array.remove(n);
				n--;
			}else{
				array.add(m);
				n++;
			}
		}
		System.exit(0);
	}
}