import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	//helper functions
	public static void print_arr(String[] arr) {
		int i = 0;
		while(i < arr.length) {
			System.out.print(arr[i]);
			if(i < arr.length - 1) {
				System.out.print(" ");
			}else {
				System.out.print("\n");
			}
			i++;
		}
	}
	
	
	
	public static int extract(String str) {
		return (int)(str.charAt(1) - '0');
	}
	
	public static boolean selection_sort(String[] arr, HashMap<Integer, Integer> boundary) {
		int i = 0;
		int n = arr.length;
		boolean stability = true; // initial as stable
		while(i < n) {
			int min = i;
			for(int j = i+1; j < n; j++) {
				if(extract(arr[min]) > extract(arr[j])) {
					min = j;
				}
			}
			
			
			if(boundary.containsKey(i)) {
				//swap cross the boundary
				if(min > boundary.get(i)) {
					stability = false;
				}
			}
			
			String tmp = arr[i];
			arr[i] = arr[min]; //swap
			arr[min] = tmp;
			i++;
		}	
		
		return stability;
	}
	
	
	
	
	// bubble sort is always stable
	public static void bubble_sort(String[] arr) {
		int i = 0;
		int n = arr.length;
		while(i < n) {
			for(int j = n-1; j > i; j--) {
				if(extract(arr[j]) < extract(arr[j-1])) {
					//swap
					String tmp = arr[j];
					arr[j]  = arr[j-1];
					arr[j-1] = tmp;
				}	
			}
			i++;
		}
		return;
	
	}
	
	// collect the possible stability boundary in the original decker ordering
	public static HashMap<Integer, Integer> collect_bd(String[] deckers){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int [] pos = new int[10]; // store the stability boundary(possible)
		Arrays.fill(pos, -1);
		
		int i = 0;
		while(i < deckers.length) {
			int val = extract(deckers[i]);
			if(pos[val] >= 0) {
				map.put(pos[val], i);
				pos[val] = -1;
			}else {
				// just put it into the buffer
				pos[val] = i;
			}
			
			i++;
		}
		
		return map;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int len = cin.nextInt();
		String [] deckers = new String[len];
		String [] copy = new String[len];
		for(int i = 0; i < len; i++) {
			deckers[i] = cin.next();
			copy[i] = deckers[i];
		}
		
	
		
		HashMap<Integer, Integer> boundary = collect_bd(deckers);
		bubble_sort(copy);
		boolean stability = selection_sort(deckers, boundary);
		print_arr(copy);
		System.out.println("Stable");
		print_arr(deckers);
		if(stability)
			System.out.println("Stable");
		else
			System.out.println("Not stable");
		
		
		cin.close();
		
		
	}
}