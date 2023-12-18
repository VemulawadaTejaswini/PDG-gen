import java.util.Scanner;

public class Main {
    public static void main(String[] srgs) {
	Scanner scan = new Scanner(System.in);

	// 定数の作り方がわからない
	
	int nums[] = new int[3]; 
	for (int i=0; i<3; i++) 
	    nums[i] = scan.nextInt();

	for (int i=0; i<3-1; i++) {
	    for (int j= 0; j<3-1-i; j++) {
		// System.out.println("i:" + i + ", j:" + j + ";" + nums[0] + " " + nums[1] + " " + nums[2]);
		
		if (nums[j] > nums[j+1]) {
		    int tmp = nums[j];
		    nums[j] = nums[j+1];
		    nums[j+1] = tmp;
		}
	    }
	}

	System.out.print(nums[0]);
	for (int i=1; i<3; i++) 
	    System.out.print(" "+nums[i]);
	System.out.print("\n");
    }
}
       