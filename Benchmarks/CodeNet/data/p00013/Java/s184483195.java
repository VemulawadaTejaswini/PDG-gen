import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Integer> in = new ArrayList<Integer>();
		while(sc.hasNextInt()) {
			in.add(sc.nextInt());
		}
		Queue<Car> out = out(in);
		for(Car c: out) System.out.println(c.num);
		sc.close();
	}
	
	static Queue<Car> out(List<Integer> args){
		LinkedList<Car> replace = new LinkedList<Car>();
		Queue<Car> out = new LinkedList<Car>();
		for(int i: args) {
			if(i == 0) out.add(replace.pollLast());
			else replace.add(new Car(i));
		}
		return out;
		
	}
}

class Car{
	int num;
	Car(int num){
		this.num = num;
	}
	
}