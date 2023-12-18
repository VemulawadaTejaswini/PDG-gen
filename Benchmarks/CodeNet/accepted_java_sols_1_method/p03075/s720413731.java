import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] list = new int[5];
		Scanner sc = new Scanner(System.in);
		list[0] = sc.nextInt();
		list[1] = sc.nextInt();
		list[2] = sc.nextInt();
		list[3] = sc.nextInt();
		list[4] = sc.nextInt();
		int k = sc.nextInt();
      
		String result = "Yay!";
		boolean error = false;
		
		for(int i=0;i<list.length;i++) {
			for(int j=i+1;j<list.length;j++) {
				if(list[j]-list[i] > k) {
					result = ":(";
					error = true;
					break;
				}
			}
			if(error) break;
		}
		
		System.out.println(result);
	}
}
