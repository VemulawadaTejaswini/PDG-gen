class Main {
	public static void main(String[] args) {
		int[] arr = new int[10];
                arr[0] = 1819;
                arr[1] = 2003;
                arr[2] = 876;
                arr[3] = 2840;
                arr[4] = 1723;
                arr[5] = 1673;
                arr[6] = 3776;
                arr[7] = 2848;
                arr[8] = 1592;
                arr[9] = 922;
		int a = arr.length - 1;
		int b = a;
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