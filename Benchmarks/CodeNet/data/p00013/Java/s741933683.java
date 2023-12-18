import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		ArrayList<Integer> cars = new ArrayList<Integer>();
		Scanner sn = new Scanner(System.in);
		while(sn.hasNext()){
			int num = sn.nextInt();
			if(num == 0){
				System.out.println(cars.get(cars.size()-1));
				cars.remove(cars.size()-1);
			} else {
				cars.add(num);
			}
		}
	}
}