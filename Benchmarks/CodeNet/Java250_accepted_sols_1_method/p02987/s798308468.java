import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		// practice contest
 
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		// char[] array = new char[4];
		// for (int i = 0; i < array.length; i++) {
		// array[i] = S.charAt(i);
		// }
		char[] array = S.toCharArray();
		Arrays.sort(array);
 
		if ((array[0] == array[1]) && (array[2] == array[3]) && (array[0] != array[2])) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
 
		Arrays.sort(array);
		// for()
		// if(array[i])
 
	}
}