import java.util.*;
public class Main{
  public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int m = s.nextInt();
	int sum = 0;
	int[] arr = new int[n];
	for (int i = 0; i < n; i++) {
		int input = s.nextInt();
		sum += input;
		arr[i] = input;
	}
	double con = ((double)1/(4*m)) * sum;
	int count = 0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] >= con) count++;
	}
	
	if (count >= m) {
		System.out.println("Yes");
	} else {
		System.out.println("No");	
	}
  }
	

}
