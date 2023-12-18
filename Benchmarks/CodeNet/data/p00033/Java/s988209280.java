import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++){
			LinkedList<Integer> A, B, C;
			A = new LinkedList<Integer>();
			B = new LinkedList<Integer>();
			C = new LinkedList<Integer>();
			for(int j=0; j<10; j++)		A.add(in.nextInt());
			if(routine(A,B,C))		System.out.println("YES");
			else					System.out.println("NO");
		}
	}
	
	private static boolean routine(LinkedList<Integer> A, LinkedList<Integer> on, LinkedList<Integer> off){
		/*
		for(Integer i : A)		System.out.print(i+" ");
		System.out.println();
		for(Integer i : on)		System.out.print(i+" ");
		System.out.println();
		for(Integer i : off)	System.out.print(i+" ");
		System.out.println();
		System.out.println();
		*/
		
		if(A.isEmpty()){
			return true;
		}else if(on.isEmpty() || on.getLast() < A.getFirst()){
			on.addLast(A.getFirst());
			A.removeFirst();
			if(routine(A, on, off))			return true;
			else if(routine(A, off, on))	return true;
			else{
				A.addFirst(on.getLast());
				on.removeLast();
				return false;
			}
		}else{
			return false;
		}
	}
}