import java.util.*;

public class Main{
	public static void main(String[] args){
		// Scanner sc = new Scanner(System.in);
		// String str = sc.nextLine();
		// sc.close();

		// int result=0;

		Scanner scan = new Scanner(System.in);

		String input_str = scan.nextLine();

		String[] num_str = input_str.split(" ");

		int[] num_int = new int[num_str.length];

		int ans;

		for(int i= 0; i < num_str.length; i++){
			num_int[i] = Integer.parseInt(num_str[i]);		
		}

		if (num_int[0] % num_int[1] ==0){
			ans = num_int[0] / num_int[1] * num_int[2];
		}
		else{
			ans = (num_int[0] / num_int[1]+1) * num_int[2];
		}
		System.out.println(ans);
	}
}