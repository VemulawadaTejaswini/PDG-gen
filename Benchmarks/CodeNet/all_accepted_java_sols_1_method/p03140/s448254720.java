import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arrA = sc.next().toCharArray();
		char[] arrB = sc.next().toCharArray();
		char[] arrC = sc.next().toCharArray();
		int count = 0;
		for (int i = 0; i < n; i++) {
		    if(arrA[i] == arrB[i]) {
		        if (arrB[i] != arrC[i]) {
		            count++;
		        }
		    } else if (arrA[i] == arrC[i] || arrB[i] == arrC[i]) {
		        count++;
		    } else {
		        count += 2;
		    }
		}
		System.out.println(count);
	}
}
