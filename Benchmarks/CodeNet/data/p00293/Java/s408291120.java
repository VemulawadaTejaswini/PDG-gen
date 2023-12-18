import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class Main{
	
	static ArrayList<Integer> array = new ArrayList<Integer>();
	static Scanner sc = new Scanner(System.in);
	static LinkedList<Integer> Link = new LinkedList<Integer>();
	
	public static void main(String[] args){
		int N = sc.nextInt();
		list(N);
		int M = sc.nextInt();
		list(M);
		
		List(N);
		List(M);
		Collections.sort(Link);
		
		for(int i = 0; i < M+N; i+=2){
			int x = 0;
			for(int u = 0; u < M+N; u++)
				if(Link.get(i) == array.get(u)){
					x = array.get(u+1);
				}
					
			System.out.printf("%d:%2d ",Link.get(i),x);
		}
			
	}
	
	static void list(int x){
		for(int i = 0; i < x; i++)
			array.add(sc.nextInt());
	}
	
	static void List(int x){
		for(int i = 0; i < x; i+=2)
			Link.add(array.get(i));
	}
}