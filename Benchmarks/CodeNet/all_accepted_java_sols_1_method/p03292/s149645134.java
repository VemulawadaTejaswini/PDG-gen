import java.util.*;
class Main{
	public static void main(String[] args1) {
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		String[] args = line.split(" ");
		int[] arr = new int[args.length];
		for(int i = 0;i < args.length;i++)
			arr[i] =  Integer.parseInt(args[i]);

		int count = 0;
		Arrays.sort(arr);
		for(int i = 0;i < arr.length-1;i++)
			count += Math.abs(arr[i] - arr[i+1]);

		System.out.println(count);


	}
}