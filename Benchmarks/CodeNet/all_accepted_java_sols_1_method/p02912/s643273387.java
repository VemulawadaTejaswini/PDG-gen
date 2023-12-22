import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		long result=0;
		Long aux;
		long[]array1=new long[m];
		PriorityQueue<Long> array = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i =0;i<n;i++) {
			array.add(s.nextLong());		
		}
		for(int i=0;i<m;i++) {
			aux = array.poll();
			aux= (aux/2);
			array.add(aux);
		}
		int a=array.size();
		for(int i=0;i<a;i++) {

			
			result+= array.poll();
		}
		System.out.print("\n"+result);
		
			
		
	}
		
		
		
		
		
		
	}

