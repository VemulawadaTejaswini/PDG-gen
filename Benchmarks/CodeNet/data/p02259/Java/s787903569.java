import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		int count = scan.nextInt();
		ArrayList<Integer> array = new ArrayList<>();
		
		for(int i=0;i<count;i++){
			array.add(scan.nextInt());
		}
		int r = bubbleSort(count, array);
		
		System.out.println(array.toString());
		System.out.println(r);
		
		/*
		bubbleSort(A, N) // N ??????????´?????????? 0-????????????????????? A
		2   flag = 1 // ????????£??\????´?????????¨??????
		3   while flag
		4     flag = 0
		5     for j ??? N-1 ?????? 1 ?????§
		6       if A[j] < A[j-1]
		7         A[j] ??¨ A[j-1] ?????????
		8         flag = 1
		*/
	}
	
	static int bubbleSort(int count, ArrayList<Integer> array){
		boolean f = true;
		int r = 0;
		while(f){
			f = false;
			for(int j=array.size();j>0;j++){
				if(array.get(j) < array.get(j-1)){
					int temp = array.get(j);
					array.set(j, array.get(j-1));
					array.set(j-1, temp);
					f = true;
					r++;
				}
			}
		}
		return r;
		
	}

}