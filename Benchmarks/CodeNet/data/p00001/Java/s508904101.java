import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class A{
	public static void main(String a[]){
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		while(scan.hasNext()){
			a.add(scan.nextInt());
		}
		int[] list = (int[])a.clone();
		Arrays.sort(list);
		
		for(int i=0;i<3;i++){
			System.out.println(list[i]);
		}
		
	}
}

