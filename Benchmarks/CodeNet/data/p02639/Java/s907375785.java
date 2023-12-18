import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[] a = new int[5];
		int index = 0;
		
		for(int i = 0; i < 5; i++) {
			a[i] = stdIn.nextInt();
			if(a[i]==0) {
				index = i;
			}
		}
		
		System.out.println(index+1);
		
		
		
		
	}

}
