import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int list[]  = new int[n];
		double sum = 0;
		boolean flag = true;

		for(int i=0; i < n; i++){
			list[i] = scan.nextInt();
			sum += list[i];
		}
		double line = sum / (4 * m);
		int con = 0;
		for(int i=0; i < n; i++){
			if (line <= list[i]) con++;
		}
		if(con < m)flag=false;
		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}