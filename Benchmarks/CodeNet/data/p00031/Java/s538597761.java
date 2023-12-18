import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){

		List<Integer> list = new ArrayList<Integer>();
		while(scan.hasNext()){
			int w = scan.nextInt();
			for(int i = 10-1; i >= 0; i--){
				if(w > Math.pow(2, i)){
					w = w - Math.pow(2, i);
					list.add(i);
				} else if(w == Math.pow(2, i)){
					list.add(i);
				}
			}
			Collections.sort(list);
			for(int i = 0; i < list.size(); i++){
				int j =(int) list.get(i);
				if(i == list.size()-1){
					System.out.printf("%d\n", Math.pow(2, j));
				} else{
					System.out.printf("%d ", Math.pow(2, j));
				}
			}
		}
	}