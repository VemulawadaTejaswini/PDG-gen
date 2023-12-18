import java.util.Scanner;
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	
		String num_size = in.next();
		String input;

		int size = Integer.parseInt(num_size);
		int i = 0;

		for(i = 0; i < size; i++){
			input = in.next();
			numbers.add(Integer.parseInt(input));
		}
		int v,j,k;
		String str;
		for(i = 0; i < size; i++){
			v = numbers.get(i);
			j = i - 1;
			while( (j >= 0) && (numbers.get(j) > v)){
				numbers.set(j+1, numbers.get(j));
				j--;
			}
		 numbers.set(j+1, v);
		 for(k = 0 ;k < size ;k++){
			 if(k != size - 1)
				 System.out.print(numbers.get(k) + " ");
			 else 
				 System.out.print(numbers.get(k));				 
		 }
			 System.out.print("\n");
		}
	}
}