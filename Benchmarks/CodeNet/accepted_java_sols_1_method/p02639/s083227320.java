import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	

	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a[] = new int[5];
		int index = 0;
		for(int i=0;i<5;i++) {
			a[i] = s.nextInt();
			if(a[i]==0) {
				index = i+1;
			}
		}
		System.out.println(index);
	}
}