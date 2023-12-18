import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
	//ABC059
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];
		long ans1 = 0;
		long ans2 = 0;
		
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
		}
		
		//+-+-
		long sum = 0;
		for(int i = 0; i < n; i++){
			sum += a[i];
			if(i % 2 == 0 && sum <= 0){
				long diff = Math.abs(sum) + 1;
				sum += diff;
				ans1 += diff;
			}else if(i % 2 == 1 && sum >= 0){
				long diff = - Math.abs(sum) - 1;
				sum += diff;
				ans1 += Math.abs(diff);
			}
		}
		
		//System.out.println(ans1);
		
		//-+-+
		sum = 0;
		for(int i = 0; i < n; i++){
			sum += a[i];
			if(i % 2 == 1 && sum <= 0){
				long diff = Math.abs(sum) + 1;
				sum += diff;
				ans2 += diff;
			}else if(i % 2 == 0 && sum >= 0){
				long diff = - Math.abs(sum) - 1;
				sum += diff;
				ans2 += Math.abs(diff);
			}
		}
		
		//System.out.println(ans2);
		System.out.println(Math.min(ans1, ans2));
	}
}