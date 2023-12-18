import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner scin = new Scanner(System.in);
		int num_list_length = Integer.parseInt(scin.nextLine());
		int[] searchable_nums = new int[num_list_length];
		String[] unparsed_nums = scin.nextLine().split(" ");
		for (int i = 0; i < unparsed_nums.length; i++) {
			searchable_nums[i] = Integer.parseInt(unparsed_nums[i]);
		}
		
		num_list_length = Integer.parseInt(scin.nextLine());
		int[] query = new int[num_list_length];
		unparsed_nums = scin.nextLine().split(" ");
		for (int i = 0; i < unparsed_nums.length; i++) {
			query[i] = Integer.parseInt(unparsed_nums[i]);
		}
		
		System.out.println(searchNumsLinear(searchable_nums, query));
	}
	
	public static int searchNumsLinear(int[] nums, int[] query) {
		boolean[] found = new boolean[query.length];
		for (int i = 0; i < nums.length; i ++) {
			int tgtnum = nums[i];
			for (int j = 0; j < query.length; j++) {
				if (found[j]) {
					continue;
				}
				if (query[j] == tgtnum){
					found[j] = true;
				}
			}
		}
		
		int ct = 0;
		for (int i = 0; i < found.length; i++) {
			if (found[i]) {
				ct += 1;
			}
		}
		return ct;
	}
}
