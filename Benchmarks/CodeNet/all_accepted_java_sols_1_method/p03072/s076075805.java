import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scan = new Scanner(System.in);){
			int N = Integer.parseInt(scan.next());
			List<Integer> list = new ArrayList<Integer>();
			int count = 1;
			for(int i=0; i<N; i++) {
				list.add(Integer.parseInt(scan.next()));
                boolean flg = true;
				for(int j =0; j<list.size()-1;j++) {
					if(list.get(j) > list.get(list.size()-1)) {
						flg = false;
					}
					if(flg && j == list.size() -2) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
