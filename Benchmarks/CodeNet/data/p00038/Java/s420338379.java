import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int min = 14;
		while(scan.hasNext()) {
			String num = scan.nextLine();
			String[] block = num.split(",");
			int[] nums = new int[block.length];
			for(int i = 0;i < block.length;i++) {
				nums[i] = Integer.parseInt(block[i]);
			}
			for(int i = 0 ;i < block.length;i++) {
				int count = 0;
				if(hashMap.containsKey(nums[i])) {
					count = hashMap.get(nums[i]);
				}
				if(min > nums[i]) {
					min = nums[i];
				}
				hashMap.put(nums[i], count + 1);
			}

			if(hashMap.containsValue(4)) {
				System.out.println("four card");
			}else if(hashMap.containsValue(3)&&hashMap.containsValue(2)) {
				System.out.println("full house");
			}else if(hashMap.containsValue(3)) {
				System.out.println("three card");
			}else if(hashMap.containsValue(2)) {
				for(Integer key : hashMap.keySet()) {
					if(hashMap.get(key) == 2) {
						hashMap.remove(key);
						break;
					}
				}
				if(hashMap.containsValue(2)) {
					System.out.println("two pair");
				}else {
					System.out.println("one pair");
				}
			}else if(hashMap.containsKey(min) && hashMap.containsKey(min + 1) && hashMap.containsKey(min + 2)
					&& hashMap.containsKey(min + 3) && hashMap.containsKey(min +4)) {
				System.out.println("straight");
			}else if(hashMap.containsKey(10) && hashMap.containsKey(11) && hashMap.containsKey(12)
					&& hashMap.containsKey(13) && hashMap.containsKey(1)) {
				System.out.println("straight");
			}else {
				System.out.println("null");
			}
			hashMap.clear();
			min = 14;
		}
		scan.close();
	}
}
