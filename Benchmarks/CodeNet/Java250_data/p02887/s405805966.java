import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String ns = s.nextLine();	
		
		String str = s.nextLine();
		
//		int n = Integer.parseInt(ns);
		
		char arr[] = str.toCharArray();

		int count = 1;
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				continue;
			}
			if(arr[i] != arr[i-1]) {
				count++;
			}
		}
		System.out.println(count);
	}

}