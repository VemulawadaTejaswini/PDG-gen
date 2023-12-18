import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();

		while(sc.hasNextInt()){
			int value = sc.nextInt();
			if(value != 0){
				n.add(value);
			}
			else{
				break;
			}
		}

		for(int i = 0; i < n.size(); i++){
			System.out.println("Case " + (i + 1) + ": " + n.get(i));
		}
	}
}