import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k;
		int[] array=new int[m];
		int sum=0;
		for(int i=0;i<n;i++) {
			k=sc.nextInt();
			for(int j=0;j<k;j++) {
				array[sc.nextInt()-1]++;
			}
		}
		for(int i=0;i<m;i++) {
			if(array[i]==n) {
				sum++;
			}
		}

		System.out.println(sum);
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


