import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr1 = sc.next().toCharArray();
		char[] arr2 = sc.next().toCharArray();
		int count = 0;
		for(int i = 0;i<arr1.length;i++) {
			if(arr1[i] == arr2[i])count++;
		}
		System.out.println(count);
	}

}
