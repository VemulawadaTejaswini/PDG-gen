import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			int n = sc.nextInt();
			long[] array = new long[n];
			for (int i=0; i<n; i++) array[i] = sc.nextLong();
			int times = sc.nextInt();  //queryの数
			for (int i=0; i<times; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				int target = sc.nextInt();
				//count(start,end,target)
				int count = 0;
				for (int j=start; j<end; j++) {
					if (array[j] == target) count++;
				}
				System.out.println(count);
			}
		}
	}
}


