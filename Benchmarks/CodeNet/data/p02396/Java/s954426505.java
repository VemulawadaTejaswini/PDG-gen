import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> x = new ArrayList<Integer>();

		while(sc.hasNextInt()){
			int value = sc.nextInt();
			if(value != 0){
				x.add(value);
			}
			else{
				break;
			}
		}

		for(int i = 0; i < x.size(); i++){
			System.out.println("Case " + (i + 1) + ": " + x.get(i));
		}
	}
}
