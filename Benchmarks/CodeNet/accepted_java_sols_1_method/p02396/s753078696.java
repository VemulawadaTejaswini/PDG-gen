import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Integer> outputs = new ArrayList<Integer>();

		while(sc.hasNextInt()){
			int value = sc.nextInt();
			if(value != 0){
				outputs.add(value);
			}
			else{
				break;
			}
		}
		
		for(int i = 0; i<outputs.size(); ++i){
			System.out.println("Case " + (i + 1) + ": " + outputs.get(i));
		}
	}
}