import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String[] nums = sc.nextLine().split(" ");
		int cont = 1;
		int bump = Integer.parseInt(nums[0]);
		for(int i = 1; i < nums.length; i++ ) {
			if(Integer.parseInt(nums[i])<bump){
				bump = Integer.parseInt(nums[i]);
				cont++;
			}
		}	
		System.out.println(cont);
	}

}