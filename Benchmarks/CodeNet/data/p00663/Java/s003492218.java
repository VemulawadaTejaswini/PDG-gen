import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		START:
		while(true){
			String in = sc.next();
			
			if("#".equals(in)){
				break;
			}
			
			String[] clauses = in.split("\\|");
			LOOP:
			for(String clause : clauses){
				clause = clause.substring(1, clause.length() - 1);
				String[] literals = clause.split("\\&");
				
				String[] vals = new String[literals.length];
				for(int i = 0; i < literals.length; i++){
					vals[i] = literals[i].length() == 1 ? literals[i] : literals[i].substring(1);
				}
				
				//System.out.println(Arrays.toString(vals));
				
				for(int i = 0; i < literals.length; i++){
					for(int j = i + 1; j < literals.length; j++){
						if(vals[i].equals(vals[j]) && !literals[i].equals(literals[j])){
							continue LOOP;
						}
					}
				}
				
				System.out.println("yes");
				continue START;
			}
			
			System.out.println("no");
		}
	}

}