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
		long currentTime = 0;
		while (currentTime < maxTime) {
			if(s1.isEmpty() && s2.isEmpty()) break;
			if(s1.isEmpty() && !s2.isEmpty()){
				currentTime += s2.pop();
				count++;
				continue;
			}else if(s2.isEmpty() && !s1.isEmpty()){
				currentTime += s1.pop();
				count++;
				continue;
			}else{
				currentTime += Math.min(s1.peek(), s2.peek());
				count++;
				int res = (s1.peek()<=s2.peek())?s1.pop():s2.pop();
			}
		}
		if (currentTime > maxTime)
			System.out.println(count - 1);
		else
			System.out.println(count);
	}

}