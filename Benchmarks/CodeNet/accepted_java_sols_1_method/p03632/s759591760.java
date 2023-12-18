import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[103];
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		arr[a+1]++; arr[b+1]--; arr[c+1]++; arr[d+1]--;
		
		
		int count = 0;
		for(int i = 1; i<=100; i++) {
			arr[i] += arr[i-1];
			if(arr[i] == 2) count++;
		}
		
		System.out.println(count);
	}

}
