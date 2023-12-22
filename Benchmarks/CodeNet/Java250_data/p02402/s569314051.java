public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
			int n = scan.nextInt();
			long min,max,sum = 0;
			long[] arr = new long[n];

			for(int i = 0;i < n;i++){
				arr[i] = scan.nextInt();
			}

			min = arr[0];
			max = arr[0];

			for(int i = 0; i < arr.length; i++){
				if(min > arr[i]){
					min = arr[i];
				}
				if(max < arr[i]){
					max = arr[i];
				}
			}
			for(int i = 0; i < arr.length; i++){
				sum += arr[i];
			}
			System.out.println(min + " " + max + " " + sum);

	}

}