import java.math.*;
import java.text.*;
import java.lang.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int[] a = new int[5];
			for(int i=0; i<5; i++){
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			System.out.println(a[4]+" "+a[3]+" "+a[2]+" "+a[1]+" "+a[0]);
		}
	}

}