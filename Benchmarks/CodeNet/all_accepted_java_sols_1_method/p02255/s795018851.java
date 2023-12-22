
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int n = Integer.parseInt(std.next());
		int array[] = new int[n];

		for (int i=0; i<n; i++){
			array[i] = Integer.parseInt(std.next());
		}
		String outsd = "";
		for (int i=1; i<n; i++){
			outsd = Integer.toString(array[0]);
			for(int id=1; id<n; id++){
				outsd += (" "+array[id]);
			}
			System.out.println(outsd);

			int v = array[i];
			int j = i-1;
			while (j>=0 && array[j] > v){
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = v;
		}
		outsd = Integer.toString(array[0]);
		for(int id=1; id<n; id++){
			outsd += (" "+array[id]);
		}
		System.out.println(outsd);
	}
}