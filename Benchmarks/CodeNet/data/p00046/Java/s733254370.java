import java.util.*;
import java.awt.geom.*;
import java.io.*;
public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		while(sc.hasNext()){
			list.add(sc.nextDouble());
		}
		Collections.sort(list);
		if(list.size() == 0){
			
		}
		else if(list.size() == 1){
			System.out.println(list.get(0));
		}
		else{
			double res = list.get(list.size() - 1) - list.get(0);
			System.out.println(res);
		}
	}
	public static void main(String [] args){
		new Main().doit();
	}
}