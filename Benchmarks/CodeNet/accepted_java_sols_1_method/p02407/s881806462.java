import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array_num=sc.nextInt();
		//int[] array=new int[array_num];
		ArrayList<Integer> array=new ArrayList<Integer>();
		for(int i=0;i<array_num;i++){
			array.add(Integer.valueOf(sc.nextInt()));
		}
		Collections.reverse(array);
		for(int i=0;i<array_num;i++){
			System.out.print(array.get(i));
			if(i!=array_num-1){
				System.out.print(" ");
			}
		}
		System.out.println();
	}

}

