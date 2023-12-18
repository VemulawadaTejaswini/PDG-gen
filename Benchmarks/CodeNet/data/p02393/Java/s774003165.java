import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] nums = sc.nextLine().split(" ");
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.parseInt(nums[0]));
		list.add(Integer.parseInt(nums[1]));
		list.add(Integer.parseInt(nums[2]));
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for(int out : list){
			sb.append(out);
			if(i == 3) break;
			sb.append(" ");
			i++;
		}
		
		System.out.println(sb);
	}
}