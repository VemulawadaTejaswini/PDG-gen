import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, mode = 0;
		int nums[] = new int[100];

		for(int i = 0; i < 100; i++){
			nums[i] = 0;
		}

		while(sc.hasNext()){
			num = sc.nextInt();

			nums[num - 1]++;
			if(mode < nums[num -1]) mode = nums[num - 1];
		}

		for(int i = 0; i < 100; i++){
			if(nums[i] == mode) System.out.println(i + 1);
		}
	}
}