
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
	public static int getParent (int indexOfArray) {
		int result = (indexOfArray - 1)/2;
		return result;
	}
	public static int getLeftChild (int indexOfArray) {
		int result = indexOfArray * 2 + 1;
		return result;
	}
	public static int getRightChild (int indexOfArray) {
		int result = indexOfArray * 2 + 2; 
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size =Integer.parseInt(sc.nextLine());
		String[] arrStr = sc.nextLine().split(" ");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < size; i += 1) {
			arr.add(Integer.parseInt(arrStr[i]));
			
		}
		for(int i = 0; i < size; i += 1) {
			int iOfL = getLeftChild(i);
			int iOfR = getRightChild(i);
			System.out.print("node "+ (i+1) +": key = " + arr.get(i) + ", ");
			if(i != 0) {
				System.out.print("parent key = "+ arr.get(getParent(i))+ ", ");
			}
			if(size > iOfL) {
				System.out.print("left key = "+ arr.get(iOfL)+ ", ");
			}
			if(size > iOfR) {
				System.out.print("right key = "+ arr.get(iOfR)+ ", ");
			}
			System.out.println("");
		}
		
		
	}

}
