import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		ArrayList<Integer> A = new ArrayList<>();
		for(int i = 0 ; i < 3 ; i++){
			A.add(sc.nextInt());
		}
		Collections.sort(A);
		int tmp=0;
		int cost= 0 ;
		for(int j = 0 ; j < 3 ; j++){
			if(j == 0)
				tmp = A.get(j);
			else {
				cost += Math.abs(A.get(j)-tmp);
				tmp = A.get(j);
			}
		}
		System.out.println(cost);
	}
}
