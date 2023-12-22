import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int count=1,max=sc.nextInt(),buff;

		for(int i=1;i<n;i++) {
			buff=sc.nextInt();
			if(max<=buff) {
				count++;
				max=buff;
			}
		}

		System.out.println(count);
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


