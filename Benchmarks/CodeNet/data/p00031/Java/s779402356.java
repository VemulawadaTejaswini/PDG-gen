import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int[] dou = new int[10];
		for(int i = 0; i < 10; i++){
			dou[i] = (int) Math.pow(2, i);
		}
		List<Integer> list = new ArrayList<Integer>();
		while(scan.hasNext()){
			int w = scan.nextInt();
			for(int i = 10-1; i >= 0; i--){
				if(w > dou[i]){
					w = w - dou[i];
					list.add(i);
				} else if(w == dou[i]){
					list.add(i);
					w = w - dou[i];
					break;
				}
			}
			Collections.sort(list);
			for(int i = 0; i < list.size(); i++){
				int j =(int) list.get(i);
				if(i == list.size()-1){
					System.out.printf("%d\n",(int) Math.pow(2, j));
				} else{
					System.out.printf("%d ",(int) Math.pow(2, j));
				}
			}
		}
	}
}