import java.util.*;
import java.text.*;
import java.math.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(in.hasNext()){
			int weight = in.nextInt();
			int cu = 1;
			for(int i=0; i<10; i++){
				if(weight%2==1) list.add(cu);
				weight = weight/2;
				cu = cu*2;
			}
			for(int i=0; i<list.size()-1; i++){
				System.out.print(list.get(i)+" ");
			}
			System.out.println(list.get(list.size()-1));
			list.clear();
		}
	}
}