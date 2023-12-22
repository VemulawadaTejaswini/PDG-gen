import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> ai = new ArrayList<Integer>();
		int min  = 0,max = 0;
		long sum = 0;

		for(int i = 0;i < n;i++){
			ai.add(sc.nextInt());
			sum += ai.get(i);
		}
		
		max =  ai.get(0);
		min =  ai.get(0);
		
		for(int i = 1;i < ai.size();i++){
			if( ai.get(i) > max){
				max =  ai.get(i);
			}
			if( ai.get(i) < min){
				min = ai.get(i);
			}
		}
			System.out.println(min + " " + max + " " + sum);
		    sc.close();
	}
}