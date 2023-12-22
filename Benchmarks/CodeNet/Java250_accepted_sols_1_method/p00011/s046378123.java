import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String args[]){

		int w,n,a,b,temp;
		Scanner in = new Scanner(System.in);
		
		w = Integer.parseInt(in.next());
		n = Integer.parseInt(in.next());
		
		int lot[] = new int[w];
		
		for(int i=0;i<w;i++){
			lot[i] = i+1;
		}
		
		String[] array;
		
		for(int i=0;i<n;i++){
			array = in.next().split(",");
			a = Integer.parseInt(array[0]) -1;
			b = Integer.parseInt(array[1]) -1;
			
			temp = lot[a];
			lot[a] = lot[b];
			lot[b] = temp;
		}
		
		for(int i=0;i<w;i++){
			System.out.println(lot[i]);
		}
		in.close();
	}
}