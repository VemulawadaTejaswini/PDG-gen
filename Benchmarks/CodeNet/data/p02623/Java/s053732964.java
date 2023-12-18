import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		int maxTime = sc.nextInt();
		int[] arr1 = new int[size1];
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[size2];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		for (int i = arr1.length - 1; i >= 0; i--) {
			s1.push(arr1[i]);
		}
		for (int i = arr2.length - 1; i >= 0; i--) {
			s2.push(arr2[i]);
		}
		// System.out.println("success");
		// System.out.println(s1.peek()+" "+s2.peek());
		int currentTime = 0;
		int pop1 = -1, pop2 = -1;
		while (currentTime < maxTime) {
			if (!s1.isEmpty())
				pop1 = s1.peek();
			if (!s2.isEmpty())
				pop2 = s2.peek();
			if ((pop1 <= pop2 && pop1 >= 0 && !s1.isEmpty()) || (!s1.isEmpty() && s2.isEmpty())) {
				currentTime += pop1;
				s1.pop();
				count++;
				continue;
			}
			if ((pop2 < pop1 && pop2 >= 0 && !s2.isEmpty()) || (!s2.isEmpty() && s1.isEmpty())) {
				currentTime += pop2;
				s2.pop();
				count++;
			}
			// pop1 = -1; pop2 = -1;
			// System.out.println(currentTime);
		}
		if (currentTime > maxTime)
			System.out.println(count - 1);
		else
			System.out.println(count);
	}

}