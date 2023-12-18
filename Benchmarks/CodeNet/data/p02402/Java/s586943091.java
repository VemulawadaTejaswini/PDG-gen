public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			int a1 = scan.nextInt();
			int a2 = scan.nextInt();
			int a3 = scan.nextInt();
			int a4 = scan.nextInt();
			int a5 = scan.nextInt();
			int i;
			int[] arr = {a1,a2,a3,a4,a5};
			int min = arr[0];
			int max = arr[0];
			for(i = 0;i<arr.length; i++){
				if(min > arr[i]){
					min = arr[i];
				}
				if(max < arr[i]){
					max = arr[i];
				}
			}
			int sum = a1+a2+a3+a4+a5;
			System.out.println(min + " " +max + " " + sum);
		}

	}

}