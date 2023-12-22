import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] num_str = str.split("");

		int result=0;
		int[] num_int = new int[num_str.length];

		for(int i=0; i < num_int.length; i++){
			num_int[i] = Integer.parseInt(num_str[i]);

			result += num_int[i]; 
		}
		sc.close();

		if(result % 9 == 0){
			System.out.println("Yes");
		}else{
		System.out.println("No");
		}
	}
}
