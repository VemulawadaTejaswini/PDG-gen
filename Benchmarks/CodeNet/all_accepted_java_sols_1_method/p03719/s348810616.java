public class Main {
	public static void main(String[] args){
		String in = new java.util.Scanner(System.in).nextLine();
		String[] nums = in.split(" ");
		int a = Integer.parseInt(nums[0]);
		int b = Integer.parseInt(nums[1]);
		int c = Integer.parseInt(nums[2]);
		if(a <= c && c <= b){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
