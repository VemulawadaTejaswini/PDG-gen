import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] H = new int[N];
		
		for(int i=0;i<N;i++) {
			H[i] = sc.nextInt();
		}
		
		int max = 0;
		for(int i=0;i<N-1;) {
			if(H[i] < H[i+1]) {
				i++;
			}else {
				int count = 0;
				while(i<N-1 && H[i] >= H[i+1]) {
					count++;
					i++;
				}
				if(count > max)max = count;
			}

		}
		System.out.println(max);
		
		sc.close();	
	}
}