import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		ArrayList<Integer> A = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for(int i=0;i<N;i++){
			A.add(scanner.nextInt());
		}
		printList(A,N);
		insertionSort(A,N);
	}
	
	static void insertionSort(ArrayList<Integer> A,int N){
		for(int i=1;i<N;i++){
			int v = A.get(i);
			int j=i-1;
			while(j>=0 && (v < A.get(j))){
				A.set(j+1,A.get(j));
				j--;
			}
			//??????????±????i????????????v??????j??????????????\??????????????????????????\?????????
			A.set(j+1, v);
			printList(A,N);
		}
	}
	static void printList(ArrayList<Integer> A,int N){
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<N;i++){
			if(i>0){
				builder.append(" ");
			}
			builder.append(A.get(i));
		}
		System.out.println(builder);
	}
}