import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>(N);
		ArrayList<Integer> sorted = new ArrayList<>(N);
		for(int i = 0; i<N; i++){
			int x = Integer.parseInt(br.readLine());
			arr.add(x);
			sorted.add(x);
		}
		
		Collections.sort(sorted);
		
		HashMap<Integer, Integer> places = new HashMap<>();
		int ind = 0;
		for(int i : sorted){
			places.put(i, ind);
			ind++;
		}
		
		ind = 0;
		int count = 0;
		for(int i : arr){
			int cplace = places.get(i);
			if(cplace%2 != ind%2) count++;
			ind++;
		}
		System.out.println(count/2);
	}
}