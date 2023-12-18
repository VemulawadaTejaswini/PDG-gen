import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		List<Integer>list = new ArrayList<Integer>();
		String[]fList = br.readLine().split(" ");
		for(int i = 0; i < Integer.parseInt(n); i++){
			list.add(Integer.parseInt(fList[i]));
		}
		System.out.println(searchMin(list) + " " + searchMax(list) + " " + sum(list));
	}

	static int searchMin(List<Integer> list) {
		int min = 1000000;
		for (int i = 0; i < list.size(); i++) {
			if (min > list.get(i)) {
				min = list.get(i);
			}
		}
		return min;
	}

	static int searchMax(List<Integer> list) {
		int max = -1000000;
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		return max;
	}

	static long sum(List<Integer> list) {
		long sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}
		return sum;
	}
}