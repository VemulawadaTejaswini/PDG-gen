import java.util.*;
import java.math.*;
import java.text.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<5; i++){
			list.add(in.nextInt());
		}
		Collections.sort(list);
		System.out.println(list.get(4)+" "+list.get(3)+" "+list.get(2)+" "+list.get(1)+" "+list.get(0));
	}
}