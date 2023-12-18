class Main {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int a = 0,b = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new java.util.Scanner(System.in).nextInt();
			a++;
		}
		a = a - 1;
		b = a;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(a - 1 > -1) {
					if(arr[a] > arr[a - 1]) {
						int c;
						c = arr[a];
						arr[a] = arr[a - 1];
						arr[a -1] = c;
					}
					a--;
				}
			}
			a = b;
			System.out.println(arr[i]);
		}
	}
}