/* 数字をソート */
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
	int nums[] = new int[1000];
	Scanner scan = new Scanner(System.in);

	int size = scan.nextInt(); // 入力される数字の数 

	for (int i=0; i<size; i++)
	    nums[i] = scan.nextInt();

	/* バブルソート */
	for (int i=0; i<size-1; i++) {
	    for (int j=0; j<size-1-j; j++) {
		if (nums[j] > nums[j+1]) {
		    int tmp = nums[j];
		    nums[j] = nums[j+1];
		    nums[j+1] = tmp;
		}
	    }
	}

	/* 表示 */
	System.out.print(nums[0]);
	for (int i=1; i<size; i++)
	    System.out.print(" "+nums[i]);
	System.out.print("\n");
    }
}