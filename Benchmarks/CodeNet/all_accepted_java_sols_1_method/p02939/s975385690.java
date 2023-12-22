import java.util.*;

public class Main {
	static char[] arr;
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		arr = sc.next().toCharArray();
		int count = 0;
		char prev = 'X';
		for (int i = 0; i < arr.length; i++) {
			if (prev == arr[i]) {
				i++;
				prev = 'X';
				count++;
			} else {
              if (i == arr.length - 2 && arr[i] == arr[i + 1]) {
                i++;
              }
				prev = arr[i];
				count++;
			}
		}
		System.out.println(count);
	}
	
}
