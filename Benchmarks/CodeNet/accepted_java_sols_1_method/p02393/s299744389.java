import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] arr = {scan.nextInt(),scan.nextInt(),scan.nextInt()};
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
	}
}